import java.util.*;
public class Supervisor implements Employee
{
    private String name;
    private int happiness;

    private List<Employee> subordinate = new ArrayList<Employee>();

    public Supervisor(String name, int happiness)
    {
        this.name = name;
        this.happiness = happiness;
    }

    public void showHappiness()
    {
        System.out.println(name + " showed happiness level of " + happiness);
        Iterator<Employee> itr=subordinate.iterator();
	while(itr.hasNext())
	{
		Employee ref=itr.next();
           	ref.showHappiness();
	}
    }

    public void addSubordinate(Employee employee)
    {
        subordinate.add(employee);
    }
}












