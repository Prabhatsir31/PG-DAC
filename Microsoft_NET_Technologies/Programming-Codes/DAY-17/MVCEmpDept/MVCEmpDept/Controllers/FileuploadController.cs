using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Infrastructure;

namespace MVCfileup.Controllers
{
    public class FileuploadController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
        [HttpPost]
        public async Task<IActionResult> SingleFileUpload(IFormFile SingleFile)
        {
            if (ModelState.IsValid)
            {
                if (SingleFile != null && SingleFile.Length > 0)
                {
                    var filePath = Path.Combine(Directory.GetCurrentDirectory(), "wwwroot/uploads", SingleFile.FileName);
                    //Using Buffering
                  /*  using (var stream = System.IO.File.Create(filePath))
                    {
                        // The file is saved in a buffer before being processed
                         SingleFile.CopyTo(stream);
                    }*/
                    //Using Streaming
                    using (var stream = new FileStream(filePath, FileMode.Create, FileAccess.Write))
                    {
                       await SingleFile.CopyToAsync(stream);
                    }
                    // Process the file here (e.g., save to the database, storage, etc.)
                    return View("UploadSuccess");
                }
            }
            return View("Index");
        }
    }
}
