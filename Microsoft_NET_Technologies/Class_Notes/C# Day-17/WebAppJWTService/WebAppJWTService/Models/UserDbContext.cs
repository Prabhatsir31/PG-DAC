using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace WebAppJWTService.Models
{
    public class UserDbContext:DbContext
    {      public UserDbContext(DbContextOptions<UserDbContext> options)
             : base(options)
        {
        }
        public DbSet<UserInfo> userInfo { get; set; }

    }
}
