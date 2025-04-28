using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Caching.Memory;
using WebAppCachingDemo.Models;

namespace WebAppCachingDemo.Controllers
{
    public class DemoTryGetController : Controller
    {
        private readonly IMemoryCache memoryCache;

        public DemoTryGetController(IMemoryCache memoryCache)
        {
            this.memoryCache = memoryCache;
        }
        public IActionResult Index()
        {
            CacheViewModel model = new CacheViewModel
            {
                FirstTime = memoryCache.Get<DateTime?>("CacheTime"),
                SecondTime = memoryCache.GetOrCreate("CacheTime", entry =>
                {
                    entry.SlidingExpiration = TimeSpan.FromSeconds(45);
                    return DateTime.Now;
                })
            };
            return View(model);
        }

    }
}
