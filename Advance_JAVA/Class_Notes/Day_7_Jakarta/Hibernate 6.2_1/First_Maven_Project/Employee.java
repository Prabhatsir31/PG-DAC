package mypack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empid",nullable=false)
	public int getEmpid() {
		return empid;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Column(name="empname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="desig")
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Column(name="salary")
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * 
	 */
	
	private int empid;
	private String name,desig;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}

}