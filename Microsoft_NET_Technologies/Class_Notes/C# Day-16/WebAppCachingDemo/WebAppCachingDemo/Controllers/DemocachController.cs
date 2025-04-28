using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Caching.Memory;

namespace WebAppCachingDemo.Controllers
{
    public class DemocachController : Controller
    {
        private readonly IMemoryCache memoryCache;

        public DemocachController(IMemoryCache memoryCache)
        {
            this.memoryCache = memoryCache;
        }
        public IActionResult Index()
        {
            DateTime currentTime;
            bool isExist = memoryCache.TryGetValue("CacheTime", out currentTime);
            if (!isExist)
            {
                currentTime = DateTime.Now;
                var cacheEntryOptions = new MemoryCacheEntryOptions()
                      .SetSlidingExpiration(TimeSpan.FromSeconds(30));

                memoryCache.Set("CacheTime", currentTime, cacheEntryOptions);
            }
            return View(currentTime);
        }


    }
}
