
using Microsoft.Extensions.Configuration;
using TestCurd;

namespace TestCurd
{
    internal class Program
    {
        private static IConfiguration _configuration;

        static void Main(string[] args)
        {
            GetConfig();
            GetRead();
        }

        public static void GetConfig()
        {
            var builder = new ConfigurationBuilder()
            .SetBasePath("E:\\SM_VITA-DAC\\MAIN_COURSE\\Microsoft_NET_Technologies\\Programming_Codes\\DAY-11\\Test\\Test")
            .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true);
            _configuration = builder.Build();
        }

        public static void GetRead()
        {
            services sread = new services(_configuration);
            sread.Printemp();
        }
    }
}
