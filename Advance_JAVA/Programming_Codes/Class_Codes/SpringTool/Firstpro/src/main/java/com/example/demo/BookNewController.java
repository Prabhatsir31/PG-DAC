package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookNewController
{
	@GetMapping("book")
	public ModelAndView before()
	{
 		Book mybook1=new Book();
	    mybook1.setBookName("Java Black Book"); 
	    mybook1.setPrice(900);
	    Book mybook2=new Book();
	    mybook2.setBookName("Understanding Pointers in C"); 
	    mybook2.setPrice(400);
	    Book mybook3=new Book();
	    mybook3.setBookName("The complete JavaEE Guide"); 
	    mybook3.setPrice(800);
	    List<Book>booklist=new ArrayList<Book>();
	    booklist.add(mybook1);
	    booklist.add(mybook2);
	    booklist.add(mybook3);
	    return new ModelAndView("Final","mylist",booklist);
	}
}

