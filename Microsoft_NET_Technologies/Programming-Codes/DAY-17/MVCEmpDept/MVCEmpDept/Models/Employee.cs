using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace MVCEmpDept.Models
{
    public class Employee
    {
        public int Id { get; set; }
        [Required]
        [DisplayName("Employee Name")]
        public string? Name { get; set; }
        [Required]
        [DataType(DataType.EmailAddress)]
        public string? Email { get; set; }
        [DisplayName("Department Id")]
        public int DepartmentId { get; set; }

        [JsonIgnore]
        public Department? Department { get; set; }


    }
}
