using System.ComponentModel.DataAnnotations;

namespace LoginForm.Models
{
    public class LoginAccount
    {
        [Required]
        public string Username { get; set; }
        [Required]
        public string Password { get; set; }
    }
}
