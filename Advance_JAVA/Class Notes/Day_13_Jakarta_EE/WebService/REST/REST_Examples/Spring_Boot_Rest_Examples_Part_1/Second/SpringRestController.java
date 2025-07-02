package mypack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;

	@RestController  
	public class SpringRestController 
	{  
	 @GetMapping(value = "api/{name}/{age}")  
	 public String hello(@PathVariable String name,@PathVariable int age) {
		 System.out.println("inside hello method");
	  String result="Hello "+name; 
	  String resp=null;
	  if(age>=18)
	  {
		  resp="   You are allowed to vote";
	  }
	  else
	  {
		  resp="   You are not allowed to vote";
	  }
	  result+=resp;
	  return result;  
	 }  
	}  






