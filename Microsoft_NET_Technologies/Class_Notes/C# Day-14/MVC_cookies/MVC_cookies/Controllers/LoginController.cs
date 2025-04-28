using Microsoft.AspNetCore.Mvc;
using MVC_cookies.Models;

public class LoginController : Controller
{
    public IActionResult Loginform()
    {
        var user = new User();

        if (Request.Cookies["LastEmail"] != null)
        {
            user.Email = Request.Cookies["LastEmail"];
        }

        return View(user);
    }

    [HttpPost]
    public IActionResult Loginform(User user)
    {
        if (ModelState.IsValid)
        {
            if (user.Remember)
            {
                CookieOptions option = new CookieOptions
                {
                    Expires = DateTime.Now.AddDays(7)
                };
                Response.Cookies.Append("LastEmail", user.Email, option);
            }

            return RedirectToAction("Index", "Home");
        }

        return View(user);
    }
}
