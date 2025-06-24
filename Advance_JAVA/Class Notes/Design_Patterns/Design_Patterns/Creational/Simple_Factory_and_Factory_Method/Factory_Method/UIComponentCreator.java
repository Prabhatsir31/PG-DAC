public abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public abstract UIComponent createUIComponent(String type);
}