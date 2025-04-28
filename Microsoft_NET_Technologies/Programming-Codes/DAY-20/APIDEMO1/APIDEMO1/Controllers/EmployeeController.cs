using APIDEMO1.Models;
using APIDEMO1.Service;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace APIDEMO1.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class EmployeeController : ControllerBase
    {
        private readonly IEmployeeService _repository;

        public EmployeeController(IEmployeeService repository)
        {
            _repository = repository;
        }

        // GET: api/Employee
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Employee>>> GetEmployee()
        {
            var employees = await _repository.GetAllEmployee();
            if (employees == null)
            {
                return NotFound();
            }

            return Ok(employees);
        }

        // GET: api/Employee/5
        [HttpGet("{id}")]
        public async Task<ActionResult<Employee>> GetById_ActionResultOfT(int id)
        {
            var employee = await _repository.GetEmployee(id);
            if (employee == null)
            {
                return NotFound();
            }
            return Ok(employee);
        }

        // PUT: api/Employee/5
        [HttpPut("{id}")]
        public async Task<IActionResult> PutEmployee(int id, Employee employee)
        {
            if (id != employee.Id)
            {
                return BadRequest();
            }

            try
            {
                await _repository.Update(id, employee);
            }
            catch (DbUpdateConcurrencyException)
            {
                var emp = await _repository.GetEmployee(id);
                if (emp == null)
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return NoContent();
        }

        // POST: api/Employee
        [HttpPost]
        public async Task<ActionResult<Employee>> PostEmployee(Employee employee)
        {
            await _repository.Add(employee);
            return CreatedAtAction(nameof(GetById_ActionResultOfT), new { id = employee.Id }, employee);
        }

        // DELETE: api/Employee/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteEmployee(int id)
        {
            var employee = await _repository.GetEmployee(id);
            if (employee == null)
            {
                return NotFound();
            }

            await _repository.Delete(id);
            return NoContent();
        }
    }
}
