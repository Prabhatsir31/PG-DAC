using Microsoft.AspNetCore.Mvc;
using LoginForm.Models;
using System;

namespace LoginForm.Controllers
{
    public class AccountController : Controller
    {
        [HttpGet]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Login(LoginAccount model)
        {
            string name = "admin";
            if (ModelState.IsValid)
            {
                if (model.Username == name && model.Password == "123")
                {
                    // Store username in cookie for 1 day
                    CookieOptions option = new CookieOptions();
                    option.Expires = DateTime.Now.AddDays(1);
                    Response.Cookies.Append("username", name, option);

                    TempData["Message"] = "Login successful!";
                    return RedirectToAction("Index", "Employee");
                }

                ModelState.AddModelError("", "Invalid username or password");
            }

            return View(model);
        }

        public IActionResult Logout()
        {
            Response.Cookies.Delete("username");
            return RedirectToAction("Login");
        }
    }
}
