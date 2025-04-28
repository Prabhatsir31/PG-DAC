using System.Diagnostics;
using MVCStudent.Models;
using Microsoft.AspNetCore.Mvc;

namespace MVCStudent.Controllers
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
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        public IActionResult Display()
        {
            return View();
        }

    }
}
