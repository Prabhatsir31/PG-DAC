using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Caching.Memory;

namespace WebAppCachingDemo.Controllers
{
    public class DemoRemoveController : Controller
    {
        private readonly IMemoryCache memoryCache;

        public DemoRemoveController(IMemoryCache memoryCache)
        {
            this.memoryCache = memoryCache;
        }
        [HttpGet]
        public IActionResult Index()
        {
            DateTime currentTime = memoryCache.GetOrCreate("CacheTime", entry =>
            {
                entry.SlidingExpiration = TimeSpan.FromSeconds(45);
                return DateTime.Now;
            });
            return View(currentTime);
        }

        [HttpPost]
        public IActionResult RemoveCache()
        {
            memoryCache.Remove("CacheTime");

        return View("Index");
        }

    }
}
