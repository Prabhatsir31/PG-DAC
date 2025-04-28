using APITEST.Models;

using System.Collections.Generic;

namespace APITEST.Services
{
    public interface IEmployeeService
    {
        IEnumerable<Employee> DisplayAllEmployee();
    }
}
