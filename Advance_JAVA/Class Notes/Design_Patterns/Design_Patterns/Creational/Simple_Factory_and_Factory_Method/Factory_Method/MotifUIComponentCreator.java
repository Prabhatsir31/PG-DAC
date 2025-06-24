public class MotifUIComponentCreator extends UIComponentCreator
{
	public UIComponent createUIComponent(String type)
	{
		if(type.equals("button"))
		{
			return new MotifButton();
		}
		else if(type.equals("textfield"))
		{
			return new MotifTextField();
		}
		//else if.....

	}
}