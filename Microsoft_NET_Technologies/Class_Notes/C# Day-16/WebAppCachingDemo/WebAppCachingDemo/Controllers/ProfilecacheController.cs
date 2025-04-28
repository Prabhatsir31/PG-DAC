using Microsoft.AspNetCore.Mvc;

namespace WebAppCachingDemo.Controllers
{
    public class ProfilecacheController : Controller
    {
        [ResponseCache(CacheProfileName = "Hourly")]
        public IActionResult Index()
        {
            DateTime s = DateTime.Now;
            return View(s);
        }
    }
}
