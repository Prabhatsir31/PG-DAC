using System.ComponentModel.DataAnnotations;
using System.Runtime.CompilerServices;

namespace MVC_cookies.Models
{
    public class User
    {
        [DataType(DataType.EmailAddress)]
        public string Email { get; set; }
        [DataType(DataType.Password)]
        public string Password { get; set; }
        public bool Remember { get; set; }

    }
}
