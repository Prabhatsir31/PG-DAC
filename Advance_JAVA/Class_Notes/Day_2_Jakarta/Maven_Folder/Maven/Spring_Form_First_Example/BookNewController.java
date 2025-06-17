package mypack;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/new_book")
public class BookNewController
{
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
 		Book defaultBook=new Book();
		defaultBook.setBookName("Enter Naya Book Name");
		defaultBook.setPrice(0);
		return new ModelAndView("bookNew","mybook",defaultBook);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String afterSubmit(
		@ModelAttribute("mb") Book book) 
	{
		//return form success view
		System.out.println("inside afterSubmit\t"+book);
		return "success";
	}
}










