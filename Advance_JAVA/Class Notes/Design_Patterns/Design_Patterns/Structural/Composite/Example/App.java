public class App
{
    public static void main(String[] args)
    {
        Worker a = new Worker("Worker Tom", 5);
        Supervisor b = new Supervisor("Supervisor Mary", 6);
        Supervisor c = new Supervisor("Supervisor Jerry", 7);
        Supervisor d = new Supervisor("Supervisor Bob", 9);
        Worker e = new Worker("Worker Jimmy", 8);

        //set up the relationships
        b.addSubordinate(a); //Tom works for Mary
        c.addSubordinate(b); //Mary works for Jerry
        c.addSubordinate(d); //Bob works for Jerry
        d.addSubordinate(e); //Jimmy works for Bob

      	c.showHappiness();
    }
}









