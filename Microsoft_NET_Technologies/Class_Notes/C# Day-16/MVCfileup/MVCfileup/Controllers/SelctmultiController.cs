using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using MVCfileup.Models;
using MVCfileup.ViewModels;
using System.Reflection;

namespace MVCfileup.Controllers
{
    public class SelctmultiController : Controller
    {
        public IActionResult Create()
        {            
            EmployeeViewModel empv = new EmployeeViewModel();                   

            return View(empv);
        }
        [HttpPost]
        public ActionResult Create(EmployeeViewModel model)
        {
            if (ModelState.IsValid)
           {
                string hobbiesSelected = "";
                foreach (string s in model.selHobbies)
                {
                    hobbiesSelected = hobbiesSelected + " " + s;
                }
      
                Employee e1=new Employee() 
                { Id=model.emp.Id,
                  Name=model.emp.Name,
                  MyHobies= hobbiesSelected
                };
                return RedirectToAction(nameof(IndexSuccess),e1);
           }

            return View(model);
        }
        public ActionResult IndexSuccess(Employee model)
        {
            //ViewData["Message"] = message;
            return View(model);
        }
    }
}
