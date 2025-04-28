using System.ComponentModel.DataAnnotations;
using System.Text.Json.Serialization;

namespace API1.Models
{
    public class Employee
    {
        public int Id { get; set; }
        [Required]
        public string Name { get; set; }
        [Required]
        [DataType(DataType.EmailAddress)]
        public string? Email { get; set; }
        public int DepartmentId { get; set; }
        [JsonIgnore]
        public Department? Department { get; set; }
    }
}
