using System.ComponentModel.DataAnnotations;

namespace MVCStudent.Models
{
    public class Student
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Department { get; set; }
        public string Stream { get; set; }
    }

}
