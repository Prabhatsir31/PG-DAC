public class WindowsUIComponentCreator extends UIComponentCreator
{
	public UIComponent createUIComponent(String type)
	{
		if(type.equals("button"))
		{
			return new WindowsButton();
		}
		else if(type.equals("textfield"))
		{
			return new WindowsTextField();
		}
		//else if.....

	}
}