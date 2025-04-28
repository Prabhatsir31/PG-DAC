using System.ComponentModel.DataAnnotations;

namespace SessionDemo.Models
{
    public class UserLogin
    {
        [Required]
        public string Email { get; set; }
        [Required]
        public string Password { get; set; }

        public bool Remember { get; set; }
    }
}
