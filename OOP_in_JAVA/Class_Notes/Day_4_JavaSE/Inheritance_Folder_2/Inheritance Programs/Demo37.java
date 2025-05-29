// converting abstract class example into interface

interface Shape
{
	void draw();
}
class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("in Triangle draw");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("in Circle draw");
	}
}
class Rect implements Shape
{
	public void draw()
	{
		System.out.println("in Rect draw");
	}
}
class Poly implements Shape
{
	public void draw()
	{
		System.out.println("in Poly draw");
	}
}
public class Demo37
{
	static void perform(Shape ref)
	{
		ref.draw();
	}

	public static void main(String args[])
	{
		perform(new Rect());

		perform(new Triangle());

		perform(new Poly());

	}
}