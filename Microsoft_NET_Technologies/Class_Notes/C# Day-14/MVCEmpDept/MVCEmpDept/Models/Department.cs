using System.ComponentModel;

namespace MVCEmpDept.Models
{
    public class Department
    {
        public int Id { get; set; }
        [DisplayName("Department Name")]
        public string? Name { get; set; }
        public ICollection<Employee>? Employees { get; set; }

    }
}
