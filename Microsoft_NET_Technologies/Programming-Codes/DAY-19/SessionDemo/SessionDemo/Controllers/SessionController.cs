using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using SessionDemo.Models;

namespace SessionDemo.Controllers
{
    public class SessionController : Controller
    {
        const string SessionName = "_Name";
        const string SessionAge = "_Age";

        public IActionResult Impdata()
        {
            if (HttpContext.Session.GetString("_Name") == null)
            {
                return RedirectToAction(nameof(Login));
            }
            return View();
        }


        public IActionResult Login()
        {

            return View();
        }

        [HttpPost]
        public IActionResult Login(UserLogin userLogin)
        {
            if (ModelState.IsValid)
            {
                if(userLogin.Email == "Vita@cdac.com")
                {
                    HttpContext.Session.SetString(SessionName, userLogin.Email);
                    return RedirectToAction(nameof(Impdata));
                }
                ModelState.AddModelError("Email", "Invalid Email or Password");
            }
            return View();
        }

        public IActionResult Logout()
        {
            HttpContext.Session.Remove(SessionName);
            HttpContext.Session.Clear();
            return RedirectToAction(nameof(Login));
        }

        



        public IActionResult Setsession()
        {
            HttpContext.Session.SetString(SessionName, "CDAC");
            HttpContext.Session.SetInt32(SessionAge, 25);
            return View();
        }

        public IActionResult ReadSession()
        {
            ViewBag.Name = HttpContext.Session.GetString(SessionName);  
            ViewBag.Age = HttpContext.Session.GetInt32(SessionAge);
            ViewData["Message"] = "Asp.NET Core !!!";
            return View();
        }
    }
}
