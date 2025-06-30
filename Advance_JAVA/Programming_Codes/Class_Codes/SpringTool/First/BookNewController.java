package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class BookNewController
{
	@GetMapping("book")
	public String before()
	{
 		return "bookNew";
	}
	
	/*
	 * @PostMapping("book") public String afterSubmit(HttpServletRequest request) {
	 * // old way to read request parameter
	 * 
	 * Book book=new Book(); book.setBookName(request.getParameter("bookname"));
	 * book.setPrice(Long.parseLong(request.getParameter("price")));
	 * request.setAttribute("mb",book); return "success"; }
	 */
	
	@PostMapping("book")
	public String afterSubmit(@RequestParam("bookname") String name,@RequestParam("price") long bookprice,Model model) 
	{
		// new way to read request parameter
		
		Book book=new Book();
		book.setBookName(name);
		book.setPrice(bookprice);
		model.addAttribute("mybook", book);
		return "success";
	}
}
