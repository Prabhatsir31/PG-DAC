using System.ComponentModel.DataAnnotations;

namespace MVCCookieForm.Models
{
    public class User
    {
        [Required]
        public string Email { get; set; }

        [Required]
        [DataType(DataType.Password)]
        public string Password { get; set; }

        public bool Remember { get; set; }
    }
}
