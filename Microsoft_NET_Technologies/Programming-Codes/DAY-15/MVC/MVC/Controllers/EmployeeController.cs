using Microsoft.AspNetCore.Mvc;
using MVC.Models;
using MVC.Services;

namespace MVC.Controllers
{
    public class EmployeeController : Controller
    {
        private readonly IEmployeeRepository _employeeRepository;

        public EmployeeController(IEmployeeRepository employeeRepository)
        {
            _employeeRepository = employeeRepository;
        }
        // GET: EmployeeController
        public ActionResult Index()
        {
            var model = _employeeRepository.GetAllEmployee();
            return View(model);
        }

        // GET: EmployeeController/Details/5
        public ActionResult Details(int id)
        {
            var model = _employeeRepository.GetEmployee(id);
            return View(model);
        }

        // GET: EmployeeController/Create
        public ActionResult Create()
        {
            return View();
        }

        // POST: EmployeeController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Employee emp)
        {
            try
            {
                if (ModelState.IsValid)
                {
                    _employeeRepository.Add(emp);
                    return RedirectToAction(nameof(Index));
                }
                else { return View(); }
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeeController/Edit/5
        public ActionResult Edit(int id)
        {
            Employee e1 = _employeeRepository.GetEmployee(id);

            return View(e1);
        }

        // POST: EmployeeController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Employee emp)
        {
            try
            {
                if (id == emp.Id)
                {

                    if (ModelState.IsValid)
                    {
                        _employeeRepository.Update(emp);
                        return RedirectToAction(nameof(Index));
                    }
                }
            }
            catch
            {
                return View();
            }
            return View();
        }

        // GET: EmployeeController/Delete/5
        public ActionResult Delete(int id)
        {
            Employee e1 = _employeeRepository.GetEmployee(id);
            return View(e1);
        }

        // POST: EmployeeController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, Employee emp)
        {
            _employeeRepository.Delete(id);
            return RedirectToAction(nameof(Index));
        }
    }
}
