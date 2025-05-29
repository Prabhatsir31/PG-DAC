interface MouseEvent
{
	void mouseClicked(); // public and abstract
	void mouseEntered();
	void mouseExited();
}

interface WindowEvent
{
	void windowClosing();
	void windowOpening();
}
abstract class WindowsApp implements MouseEvent,WindowEvent
{
	/*public void mouseClicked()
	{
		System.out.println("in WindowsApp mouse clicked");
	}*/
	public void mouseExited()
	{
		System.out.println("in WindowsApp mouse exited");
	}
	public void mouseEntered()
	{
		System.out.println("in WindowsApp mouse entered");
	}
	public void windowClosing()
	{
		System.out.println("in WindowsApp window closing");
	}
	public void windowOpening()
	{
		System.out.println("in WindowsApp window opening");
	}
}

class LinuxApp implements MouseEvent,WindowEvent
{
	public void mouseClicked()
	{
		System.out.println("in LinuxApp mouse clicked");
	}
	public void mouseExited()
	{
		System.out.println("in LinuxApp mouse exited");
	}
	public void mouseEntered()
	{
		System.out.println("in LinuxApp mouse entered");
	}
	public void windowClosing()
	{
		System.out.println("in LinuxApp window closing");
	}
	public void windowOpening()
	{
		System.out.println("in LinuxApp window opening");
	}
}

public class GUIDemo1
{
	public static void main(String args[])
	{
		WindowsApp w=new WindowsApp();
		w.mouseClicked();
		w.mouseEntered();
		w.mouseExited();
		w.windowOpening();
		w.windowClosing();

		System.out.println("*********");
		LinuxApp l=new LinuxApp();
		l.mouseEntered();
		l.mouseExited();
		l.windowOpening();
		l.windowClosing();
	}
}











