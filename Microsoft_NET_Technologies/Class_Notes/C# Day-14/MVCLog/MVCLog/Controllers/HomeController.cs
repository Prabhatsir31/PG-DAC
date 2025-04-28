using Microsoft.AspNetCore.Mvc;
using MVCLog.Models;
using System.Diagnostics;

namespace MVCLog.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            _logger.LogInformation("Index  visited at {DT}",
            DateTime.UtcNow.ToLongTimeString());//Time utc
            //DateTime.Now.ToString();/Date time utc+5.30
            return View();
        }

        public IActionResult Privacy()
        {
            _logger.LogInformation("privacy  visited at {DT}",
           DateTime.UtcNow.ToLongTimeString());
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
