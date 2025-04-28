using Microsoft.AspNetCore.Mvc;

namespace MVCErrPage.Controllers
{
    public class ErrorController : Controller
    {
        [Route("Error/{statusCode}")]
        public IActionResult HttpStatusCodeHandler(int statusCode)
        {
            switch (statusCode)
            {
                case 404:
                    ViewBag.ErrorMessage = "Sorry, the resource you requested could not be found.";
                    break;

                case 500:
                    ViewBag.ErrorMessage = "Internal server error. Please try again later.";
                    break;

                default:
                    ViewBag.ErrorMessage = "An unexpected error occurred.";
                    break;
            }
            return View("NotFound"); // Make sure NotFound.cshtml exists in Views/Error
        }
    }
}
