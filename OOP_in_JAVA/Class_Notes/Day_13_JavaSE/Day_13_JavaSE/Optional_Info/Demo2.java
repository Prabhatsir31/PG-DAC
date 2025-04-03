import java.util.Optional;
public class Demo2 {

	static String getName()
	{
		return "Sachin";
		//return null;
	}
	public static void main(String[] args) 
	{
		Optional<String>op=Optional.ofNullable(getName());
		System.out.println(op); // contains the object returned by "getName"
		System.out.println(op.isPresent());
		op.ifPresent(s->System.out.println(s.length()));
		op.ifPresent(s-> System.out.println(s.equalsIgnoreCase("Sachin")));
System.out.println(op.filter(s->s.equalsIgnoreCase("rahul")).isPresent());
	}
}
