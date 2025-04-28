public class Employee
{
    private static int counter = 1;

    public int Id { get; private set; }
    public string Name { get; set; }
    public double Salary { get; set; }
    public string Gender { get; set; }

    public Employee()
    {
        this.Id = counter++;
    }

    public override string ToString()
    {
        return $"ID: {Id}, Name: {Name}, Salary: {Salary}, Gender: {Gender}";
    }
}
