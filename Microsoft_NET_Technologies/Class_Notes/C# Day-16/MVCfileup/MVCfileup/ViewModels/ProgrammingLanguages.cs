namespace MVCfileup.ViewModels
{
    public class ProgrammingLanguagesViewModel
    {
        public List<LanguageOption> LanguageOptions { get; set; }
    }
    public class LanguageOption
    {
        public bool IsSelected { get; set; }
        public string LanguageName { get; set; }
    }
}
