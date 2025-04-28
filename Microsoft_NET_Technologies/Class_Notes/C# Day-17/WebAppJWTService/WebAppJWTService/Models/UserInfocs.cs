using System.ComponentModel.DataAnnotations;

namespace WebAppJWTService.Models
{
    public partial class UserInfo
    {
        [Key]
        public int UserId { get; set; }
        public string? FirstName { get; set; }
        public string? LastName { get; set; }
        public string? UserName { get; set; }
        public string? Email { get; set; }
        public string? Password { get; set; }
        public DateTime CreatedDate { get; set; }
    }

}
