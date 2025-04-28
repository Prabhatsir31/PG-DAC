using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using MVCEmpDept.Models;
using MVCEmpDept.Service;
using System.Diagnostics;
namespace MVCEmpDept.Controllers
{
    public class EmployeeController : Controller
    {
        private IEmployeeService _employeeRepository;
        private readonly ILogger<EmployeeController> _logger;

        public EmployeeController(IEmployeeService employeeRepository, ILogger<EmployeeController> logger)
        {
            _employeeRepository = employeeRepository;
            _logger = logger;
        }

        //DI in Method
        //you will get serialization error
        //add code in program.cs
        public IActionResult Display([FromServices] IEmployeeService es)
        {
            var model = es.GetAllEmployee();
            return Json(model);
        }
        //DI in View
        public ActionResult Dispview()
        {
            return View();
        }
        // GET: EmployeeController
        public ActionResult Index()
        {
            _logger.LogInformation("Getting emp details");

            var model = _employeeRepository.GetAllEmployee();
            return View(model);
        }
        // GET: EmployeeController/Details/5
        public ActionResult Details(int id)///1
        {
            var model = _employeeRepository.GetEmployee(id);
            if (model == null)
            {
                Response.StatusCode = 404;
                return View("Error", new ErrorViewModel
                {
                    RequestId = Activity.Current?.Id
                    ?? HttpContext.TraceIdentifier
                });
            }
            return View(model);
        }
        // GET: EmployeeController/Create
        public ActionResult Create()
        {
            IEnumerable<Department> DepartmentName = _employeeRepository.GetAllDepartment();

            ViewData["xyz"] = new SelectList(DepartmentName, "Id", "Name");
            return View();
        }
        // POST: EmployeeController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Employee employee)//, IFormCollection col)
        {
            IEnumerable<Department> DepartmentName = _employeeRepository.GetAllDepartment();
            //try
            //{
            if (ModelState.IsValid)
            { //Employee e = new Employee();
              //  e.Email = col["Email"];

                var model = _employeeRepository.Add(employee);
                return RedirectToAction(nameof(Index));
            }
            // ModelState.Clear(); 
            ViewData["xyz"] = new SelectList(DepartmentName, "Id", "Name");
            return View();

            // }
            //catch
            // {
            // return View();
            //}
        }
        public ActionResult Edit(int id)
        {
            var model = _employeeRepository.GetEmployee(id);

            if (model == null)
            {
                // throw new Exception("err...");
                return View("Errorpage", id);
            }
            IEnumerable<Department> DepartmentName = _employeeRepository.GetAllDepartment();
            ViewData["DepartmentId"] = new SelectList(DepartmentName, "Id", "Name", model.DepartmentId);
            return View(model);
        }
        // POST: EmployeeController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(Employee emp)
        {
            if (ModelState.IsValid)
            {
                try
                {
                    var model = _employeeRepository.Update(emp);
                    return RedirectToAction(nameof(Index));
                }
                catch
                {
                    return View(emp);
                }
            }
            IEnumerable<Department> DepartmentName = _employeeRepository.GetAllDepartment();
            ViewData["DepartmentId"] = new SelectList(DepartmentName, "Id", "Name", emp.DepartmentId);
            return View(emp);
        }

        // GET: EmployeeController/Delete/5
        public ActionResult Delete(int id)
        {
            var model = _employeeRepository.GetEmployee(id);
            if (model == null)
                return NotFound();
            return View(model);

        }

        // POST: EmployeeController/Delete/5
        [HttpPost]
        [ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult Deletedata(int id)
        {
            try
            {
                var model = _employeeRepository.Delete(id);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
