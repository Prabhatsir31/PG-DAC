using Microsoft.AspNetCore.Http;

namespace MVCEmpDept.Services
{
    public class SessionService
    {
        private readonly IHttpContextAccessor _httpContextAccessor;

        public SessionService(IHttpContextAccessor httpContextAccessor)
        {
            _httpContextAccessor = httpContextAccessor;
        }

        public void SaveUserEmail(string email) => _httpContextAccessor.HttpContext.Session.SetString("UserEmail", email);

        public string? GetUserEmail()
        {
            return _httpContextAccessor.HttpContext.Session.GetString("UserEmail");
        }
    }
}
