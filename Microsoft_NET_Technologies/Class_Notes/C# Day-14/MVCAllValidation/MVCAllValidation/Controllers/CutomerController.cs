using Microsoft.AspNetCore.Mvc;
using MVCAllValidation.Models;
using System.Reflection;


namespace MVCAllValidation.Controllers
{
    public class CutomerController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        public IActionResult Create()
        {
           CustomerMetadata obj = new CustomerMetadata();

         //   ViewBag.listdata = obj;
            return View(obj);
            
        }
    }
}
