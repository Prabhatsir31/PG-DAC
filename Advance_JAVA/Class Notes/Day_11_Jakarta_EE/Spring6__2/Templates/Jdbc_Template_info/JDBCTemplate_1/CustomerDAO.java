package mypack;
import java.util.*;
public interface CustomerDAO 
{
	public void insertCustomer(Customer customer);
	public List<?> viewCustomers();
}
