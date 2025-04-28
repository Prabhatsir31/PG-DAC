using Microsoft.AspNetCore.Mvc;
using MVCerrpage.Models;
using System.Diagnostics;

namespace MVCerrpage.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }
        [Route("House/property")]
        public string GetHouse()
        {

            return "property found";
        }
        [Route("House/property")]
        public string GetHouse(int id)
        {

            return "property found"+id;
        }
        public IActionResult Index()
        { 
            return View();
        }
        [NonAction]
        public IActionResult IMpInfo()
        {
            return View();
        }
        private string impdata()
        {
            return "IMP data";
        }
        public IActionResult Privacy()
        { 
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            var obj = new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier };
            return View(obj);
        }
    }
}
