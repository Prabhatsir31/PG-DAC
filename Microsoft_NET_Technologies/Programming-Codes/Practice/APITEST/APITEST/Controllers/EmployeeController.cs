using APITEST.Services;
using Microsoft.AspNetCore.Mvc;

namespace RestDemoApi.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeeController : ControllerBase
    {
        private readonly IEmployeeService _employeeService;

        public EmployeeController(IEmployeeService employeeService)
        {
            _employeeService = employeeService;
        }

        [HttpGet]
        public IActionResult GetAllEmployees()
        {
            var employees = _employeeService.DisplayAllEmployee();
            return Ok(employees);
        }
    }
}
