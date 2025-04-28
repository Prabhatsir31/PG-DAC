
using Microsoft.EntityFrameworkCore;
using APITEST.Models;
using APITEST.Repository;
using APITEST.Services;

namespace RestDemoApi.Services
{
    public class EmployeeService : IEmployeeService
    {
        private readonly AppdbContext _context;

        public EmployeeService(AppdbContext context)
        {
            _context = context;
        }

        public IEnumerable<Employee> DisplayAllEmployee()
        {
            return _context.Employees.Include(e => e.Department).ToList();
        }
    }
}
