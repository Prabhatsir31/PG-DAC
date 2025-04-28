using Microsoft.AspNetCore.Mvc;

namespace MVCEmpDept.Controllers
{
    public class ErrorController : Controller
    {
        // If there is 404 status code, the route path will become Error/404
        [Route("Error/{statusCode}")]
        public IActionResult HttpStatusCodeHandler(int statusCode)
        {
            switch (statusCode)
            {
                case 404:
                    ViewBag.ErrorMessage = "Sorry, the resource you requested could not be found";
                    break;
            }

            return View("NotFound");
        }
    }
}
