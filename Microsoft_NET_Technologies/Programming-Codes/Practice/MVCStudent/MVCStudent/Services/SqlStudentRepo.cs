using Microsoft.EntityFrameworkCore;
using MVCStudent.Models;
using MVCStudent.Repository;
using System.Linq;



namespace MVCStudent.Services
{
    public class SqlStudentRepo: IStudentRepo
    {
        private readonly Appdbcontext context;

        public SqlStudentRepo(Appdbcontext context)
        {
            this.context = context;
        }

        public Student Add(Student student)
        {
            context.Add(student);
            context.SaveChanges();
            return student;
        }

        public Student Delete(int Id)
        {
            Student student = context.student.Find(Id);
            if (student != null)
            {
                context.student.Remove(student);
                context.SaveChanges();
            }
            return student;
        }

        public IEnumerable<Student> GetAllStudent()
        {
            return context.student;
        }

        public Student GetStudent(int Id)
        {
            context.student.SingleOrDefault(data => data.Id == Id);
            return context.student.Find(Id);
        }

        public Student Update(Student studentChanges)
        {
            context.Entry(studentChanges).State =EntityState.Modified;
            context.Update(studentChanges);
            context.SaveChanges();
            return studentChanges;
        }
    }
}
