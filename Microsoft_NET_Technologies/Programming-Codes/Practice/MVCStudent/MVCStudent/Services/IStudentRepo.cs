using MVCStudent.Models;

namespace MVCStudent.Services
{
    public interface IStudentRepo
    {
        Student GetStudent(int Id);
        IEnumerable<Student> GetAllStudent();

        Student Add(Student student);
        Student Update(Student studentChanges);

        Student Delete(int Id);
    }
}
