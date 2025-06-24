public class GUIApplication
{
	public static void main(String args[])
	{
		UIComponentCreator creator=new WindowsUIComponentCreator();
		creator.show("button");

		creator=new MotifUIComponentCreator();
		creator.show("button");
	}
}