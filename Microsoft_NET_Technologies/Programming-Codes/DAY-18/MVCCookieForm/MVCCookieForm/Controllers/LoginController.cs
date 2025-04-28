using Microsoft.AspNetCore.Mvc;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages;
using MVCCookieForm.Models;

public class LoginController : Controller
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

    public IActionResult LoginSuccess()
    {
        ViewBag.Email = HttpContext.Session.GetString(SessionName);
        return View();
    }


    public IActionResult Login()
    {
        var user = new User();

        if (Request.Cookies["LastEmail"] != null)
        {
            user.Email = Request.Cookies["LastEmail"];
        }

        return View(user);
    }

    [HttpPost]
    public IActionResult Login(User user)
    {
        if (ModelState.IsValid)
        {
            // Store in session
            HttpContext.Session.SetString(SessionName, user.Email);

            // Save to cookie
            if (user.Remember)
            {
                CookieOptions option = new CookieOptions
                {
                    Expires = DateTime.Now.AddDays(1)
                };
                Response.Cookies.Append("LastEmail", user.Email, option);
            }

            // ✅ Redirect to confirmation page
            return RedirectToAction("LoginSuccess", "Login");
        }

        return View(user);
    }


    public IActionResult Logout()
    {
        HttpContext.Session.Remove(SessionName);
        HttpContext.Session.Clear();

        return RedirectToAction("LogoutSuccess", "Login");
    }

    public IActionResult LogoutSuccess()
    {
        return View();
    }

    

    public IActionResult Setcookie()
    {
        HttpContext.Session.SetString(SessionName, "CDAC");
        HttpContext.Session.SetInt32(SessionAge, 25);
        return View();
    }

    public IActionResult Readcookie()
    {
        ViewBag.Name = HttpContext.Session.GetString(SessionName);
        ViewBag.Age = HttpContext.Session.GetInt32(SessionAge);
        ViewData["Message"] = "Asp.NET Core !!!";
        return View();
    }

}
