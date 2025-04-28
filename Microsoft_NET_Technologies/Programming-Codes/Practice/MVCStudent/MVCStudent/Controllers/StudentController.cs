using Microsoft.AspNetCore.Mvc;
using MVCStudent.Models;
using MVCStudent.Services;

namespace MVCStudent.Controllers
{
    public class StudentController : Controller
    {
        private IStudentRepo _studentRepo;
        public StudentController(IStudentRepo studentRepo) 
        {
            _studentRepo = studentRepo;
        }

        public ActionResult Index()
        {
            var model = _studentRepo.GetAllStudent();
            return View(model);
        }
        // GET: EmployeeController/Details/5
        public ActionResult Details(int Id)
        {
            var model = _studentRepo.GetStudent(Id);
            return View(model);
        }

        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Student student)
        {
            if (ModelState.IsValid)
            {
                _studentRepo.Add(student);
                return RedirectToAction(nameof(Index));
            }
            else
            {
                return View(student);
            }
            
        }

        public ActionResult Edit(int id)
        {
            var student = _studentRepo.GetStudent(id);
            return View(student);
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Student emp)
        {
            try
            {
                if (id == emp.Id)
                {

                    if (ModelState.IsValid)
                    {
                        _studentRepo.Update(emp);
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
            var e1 = _studentRepo.GetStudent(id);
            return View(e1);
        }

        // POST: EmployeeController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, Student emp)
        {
            _studentRepo.Delete(id);
            return RedirectToAction(nameof(Index));
        }

    }
}
