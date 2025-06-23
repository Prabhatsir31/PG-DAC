package tagpack;
import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
public class TagCode1 extends SimpleTagSupport
{
	public void doTag()throws JspException,IOException
	{
		getJspContext().getOut().print("This is a first simple tag");
	}
}