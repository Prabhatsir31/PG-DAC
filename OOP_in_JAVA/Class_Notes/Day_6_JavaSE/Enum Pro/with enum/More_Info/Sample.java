// let's access some the methods from Enum class which is a parent class of all the enums we create.

enum Days
{
	Friday,Saturday,Sunday;
}
public class Sample {

	public static void main(String[] args) 
	{
		Days arr[]=Days.values();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].name()+"\t"+arr[i].ordinal());
		}
		
	}

}
