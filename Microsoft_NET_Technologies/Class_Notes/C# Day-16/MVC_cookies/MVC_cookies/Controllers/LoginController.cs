using Microsoft.AspNetCore.Mvc;
using MVC_cookies.Models;

namespace MVC_cookies.Controllers
{ //Login/Loginform
    public class LoginController : Controller
    {
        public IActionResult Readcookie()
        {
            string key = "Ukey";
            var CookieValue = Request.Cookies[key]?.ToString();
            ViewBag.CookieValue = CookieValue;
            return View();            
        }
        [HttpPost]
       
        public IActionResult Deletecookie()
        {
            string key = "Ukey";
            string value = "";

            CookieOptions options = new CookieOptions();
            options.Expires = DateTime.Now.AddDays(-1);
            Response.Cookies.Append(key, value, options);
            return RedirectToAction(nameof(Loginform));

        }
        public IActionResult Loginform()
        { 
            string key = "Ukey";
            var CookieValue = Request.Cookies[key]?.ToString();
            if (CookieValue != null)
            {
                User obj = new User();
                obj.Email = CookieValue;
                return View(obj);
            }
            return View();
        }
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Loginform(User Userdata)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    if (Userdata.Remember == true)
                    {
                        CookieOptions options = new CookieOptions();
                        options.Expires = DateTime.Now.AddDays(7);
                        Response.Cookies.Append("Ukey", Userdata.Email, options);
                    }
                }

                return RedirectToAction(nameof(Readcookie));
            }
            catch
            {
                return View();
            }
        }

    }
}