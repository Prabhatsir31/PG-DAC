using System.ComponentModel.DataAnnotations;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations.Schema;

namespace MVCAllValidation.Models
{
    [MetadataType(typeof(CustomerMetadata))]
    public partial class Customer
    {
        [Key]
        public int Id { get; set; }       
        public string Name { get; set; }     
        public string Photo { get; set; }
        public string Password { get; set; }
        public string Address { get; set; }        
        public System.DateTime DOB { get; set; }       
        public string URL { get; set; }       
        public string Email { get; set; }
        [NotMapped]
        public string ConfirmEmail { get; set; }
        public string Mobile { get; set; }
        public string Gender { get; set; }
        public bool Remember { get; set; } //bool datatype give single checkbox       
        public string PostalCode { get; set; }
    }
}
