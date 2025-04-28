using System.ComponentModel.DataAnnotations;

namespace MVCSession.Models
{
    public class UserLogin
    {
        public string Email { get; set; }
        public int Age { get; set; }
        [Required]
        [DataType(DataType.Password)]
        public string Password { get; set; }
      
        public bool Remember { get; set; }

    }
}
