using System.ComponentModel.DataAnnotations;

namespace MVC.Models
{
    public class Employee
    {
        public int Id { get; set; }

        [MaxLength(50, ErrorMessage = "Name cannot exceed 50 characters")]
        public string Name { get; set; }
        [Display(Name = "Office Email")]
        [RegularExpression(@"^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$",
        ErrorMessage = "Invalid email format")]

        public string Email { get; set; }
        public string Department { get; set; }

    }

}
