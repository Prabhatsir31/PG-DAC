using static System.Runtime.InteropServices.JavaScript.JSType;

namespace MVCerrpage.Models
{
    public class ErrorViewModel
    {
        public string? RequestId { get; set; }

        public bool ShowRequestId => !string.IsNullOrEmpty(RequestId);
    }
}