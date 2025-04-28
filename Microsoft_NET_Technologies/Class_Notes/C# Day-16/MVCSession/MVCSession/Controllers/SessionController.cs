using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.VisualStudio.Web.CodeGenerators.Mvc.Templates.BlazorIdentity.Pages.Manage;
using MVCSession.Models;

namespace MVCSession.Controllers
{
    public class SessionController : Controller
    {
        const string SessionEmail= "_Name";
        const string SessionAge = "_Age";
        public IActionResult Index()
        {
            if (HttpContext.Session.GetString(SessionEmail) != null)
            {
                ViewBag.Email = HttpContext.Session.GetString(SessionEmail);
                ViewBag.Age = HttpContext.Session.GetInt32(SessionAge);
                ViewBag.Sid = HttpContext.Session.Id;
                ViewData["Message"] = "Asp.Net Core !!!.";
                return View();

            }
            return RedirectToAction("Create");
        }
        // GET: UserLoginController/Create
        public ActionResult Create()
        {
            return View();
        }
        // POST: UserLoginController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(UserLogin Userdata)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    if (Userdata.Email == "vita@cdac.in")
                    {
                        HttpContext.Session.SetString(SessionEmail, Userdata.Email);
                        HttpContext.Session.SetInt32(SessionAge, Userdata.Age);
                        return RedirectToAction(nameof(Index));
                    }
                    else {
                        ModelState.AddModelError("Email", "Not a Valid email");
                        return View(Userdata);
                    }
                }
                else { return View(); }                
            }
            catch
            {
                return View(Userdata);
            }
        }
        [HttpPost]
        public ActionResult Delete()
        {
            HttpContext.Session.Remove(SessionEmail);

            return RedirectToAction("Create");
        }
        
        public ActionResult DeleteData()
        {
            HttpContext.
                Session.Remove(SessionEmail);

            return RedirectToAction(nameof(Create));
        }

    }
}

