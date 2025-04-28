using System.ComponentModel.DataAnnotations;
using System.ComponentModel;

namespace MVCAllValidation.Models
{
    public  class CustomerMetadata
    {      
            [Key]
            public int Id { get; set; } //number
            [Required]
            [DisplayName("Customer Name")]//UI will display Customer Name
            public string Name { get; set; } //text
            [Required]
            public string Photo { get; set; }//text

            [StringLength(15, MinimumLength = 8)]
            [Required]
            [DataType(DataType.Password)] //input type="Password"
            public string Password { get; set; }//password

            [Required]
            [DataType(DataType.MultilineText)] //Textarea
            public string Address { get; set; }

            [Required]
            [DataType(DataType.Date)] //input type="Date [Calander]
            [DisplayFormat(DataFormatString = "{0:d}", ApplyFormatInEditMode = true)]
            public System.DateTime DOB { get; set; }

            [Required(ErrorMessage = "Please enter your URL correctly")]
            [DataType(DataType.Url)] //  URL==>"Http...."
            public string URL { get; set; }

            [Required]
            [DataType(DataType.EmailAddress)] //input type ="Email"
            [RegularExpression(@"^[\w-\._\+%]+@(?:[\w-]+\.)+[\w]{2,6}$", ErrorMessage = "Please enter a valid email address")]
            public string Email { get; set; }

            [Compare("Email", ErrorMessage = "Email and confirm Email should match")]
            public string ConfirmEmail { get; set; }

            [RegularExpression("[0-9]{10}", ErrorMessage = "Please enter a valid mobile address")]
            [Required(ErrorMessage = "Please enter your phone number")]
            [DataType(DataType.PhoneNumber)] //type="tel"
            public string Mobile { get; set; }
            public string Gender { get; set; }
            public bool Remember { get; set; } //bool datatype give single checkbox 

            [RegularExpression("[0-9]{6}", ErrorMessage = "Please enter a valid Postal Code")]
            [Required(ErrorMessage = "Please enter your Pin code")]
            public string PostalCode { get; set; }
        public string hobbies { get; set; }
   
        public List<String> listhobbies()
        {
            List<String> Listhob= new List<String>()
            {
                    "Dance","Music"
            };
            return Listhob;
        }
    }

    
}
