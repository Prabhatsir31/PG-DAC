using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using MVCErrPage.Models;

namespace MVCErrPage.Controllers
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

            return "property found "+ id;
        }


        public IActionResult Index()
        {
            return View();
        }

        // [NonAction]
        [Route("Private")]
        public string Private()
        {
            return "Special imp data";
        }

        public IActionResult ImpInfo()
        {
            return View();
        }

        private string Impdata()
        {
            return "Imp Data";
        }

        public IActionResult Privacy()
        {
            string s = Impdata();
            return View(s);
        }

        

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
