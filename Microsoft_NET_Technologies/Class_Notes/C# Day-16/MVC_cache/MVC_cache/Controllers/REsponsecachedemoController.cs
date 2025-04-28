using Microsoft.AspNetCore.Mvc;

namespace MVC_cache.Controllers
{
    public class REsponsecachedemoController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        [ResponseCache(Duration = 36000)]
        public String Details()
        {
            return $"Response Generated at: {DateTime.Now}";
        }
        [ResponseCache(CacheProfileName = "Weekly")]
        public IActionResult Display()
        {
            return View();
        }

    }
}
