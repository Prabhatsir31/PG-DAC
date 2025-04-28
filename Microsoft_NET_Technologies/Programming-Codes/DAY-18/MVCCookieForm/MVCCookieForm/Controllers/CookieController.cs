using Microsoft.AspNetCore.Mvc;

namespace MVCCookieForm.Controllers
{
    public class CookieController : Controller
    {
        public IActionResult Create()
        {
            string key = "DemoCookie";
            string value = DateTime.Now.ToString();

            CookieOptions options = new CookieOptions();
            options.Expires = DateTime.Now.AddDays(7);
            Response.Cookies.Append(key, value, options);
            return View();
        }
    }
}
