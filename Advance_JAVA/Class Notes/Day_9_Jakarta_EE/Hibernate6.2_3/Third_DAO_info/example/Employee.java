package mypack;

import java.io.Serializable;

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
  
@Entity  
public class Employee implements Serializable 
{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;  
    private String name,desig; 
    private double salary;
    
      
    
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+desig+"\t"+salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    public Long getId()  
    {  
        return id;  
    }  
    public void setId(Long id)  
    {  
        this.id = id;  
    }  
   
  
   
}  
