package tagpack;
import java.io.*
import jakarta.servlet.jsp.JspContext;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
public class TagCode2 extends SimpleTagSupport
{
	private String code;
	private String desc;
	private int price;
	public void setCode(String code)
	{
		this.code=code;
	}
	public String getCode()
	{
		return code;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public void doTag()throws JspException,IOException
	{
		JspContext context=getJspContext();
		context.getOut().write(getCode()+"  "+getDesc()+"  "+getPrice());
		
	}
}




