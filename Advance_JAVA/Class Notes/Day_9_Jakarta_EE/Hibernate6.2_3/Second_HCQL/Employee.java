package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  
public class Employee  
{  
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
