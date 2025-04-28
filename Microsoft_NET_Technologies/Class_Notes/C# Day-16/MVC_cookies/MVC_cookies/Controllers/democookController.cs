using Microsoft.AspNetCore.Mvc;

namespace MVC_cookies.Controllers
{
    public class democookController : Controller
    {
       
            public IActionResult Create()
            {
                string key = "DemoCookie";
                string value = "SMVITa";

                CookieOptions options = new CookieOptions();
               options.Expires = DateTime.Now.AddDays(7);
                Response.Cookies.Append(key, value, options);
                return View();
            }
            public IActionResult Read()
            {
            string key = "DemoCookie";
            var CookieValue = Request.Cookies[key];
            ViewBag.CookieValue = CookieValue;  

            return View();
        }
        public IActionResult Remove()
        {
            string key = "DemoCookie";
            string value ="";

           /* CookieOptions options = new CookieOptions();
            options.Expires = DateTime.Now.AddDays(-1);
            Response.Cookies.Append(key, value, options);*/
           
            Response.Cookies.Delete(key);

            return View();
        }


    }
}
