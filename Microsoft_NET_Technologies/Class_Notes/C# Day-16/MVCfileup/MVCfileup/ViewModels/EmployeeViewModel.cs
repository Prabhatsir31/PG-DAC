using Microsoft.AspNetCore.Mvc.Rendering;
using MVCfileup.Models;

namespace MVCfileup.ViewModels
{
    public class EmployeeViewModel
    {
       public Employee emp {  get; set; }
        public IEnumerable<string> selHobbies { get; set; }
        public List<SelectListItem> listHobies { get; } = new List<SelectListItem>()
        {
            new SelectListItem { Value = "Dance", Text = "Dance" },
            new SelectListItem { Value = "Music", Text = "Music" },
            new SelectListItem { Value = "Sports", Text = "Sports"    }


        };
    }
}
