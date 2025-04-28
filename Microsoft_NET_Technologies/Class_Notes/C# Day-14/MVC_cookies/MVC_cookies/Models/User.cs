using System.ComponentModel.DataAnnotations;
using System.Runtime.CompilerServices;

namespace MVC_cookies.Models
{
    public class User
    {
        public string Email { get; set; }
        public string Password { get; set; }
        public bool Remember { get; set; }
    }

}
