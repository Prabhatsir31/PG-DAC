/*
 public abstract class Course
{
	public void start()
	{
		// start process
	}
	public abstract double getFee();
	public abstract void evaluate();
}

define child classes of above abstract class
	DACDBDACourse extends Course
	MSCitCourse extends Course

show late binding with the help of "perform()" method.
 */

package Abtrac;

abstract class Course {
	public void start() {
		System.out.println("Starting the course...");
	}
	public abstract double getFee();
	public abstract void evaluate();
}

class DACDBDACourse extends Course {
	@Override
	public double getFee() {
		return 1500.00; 
	}
	
	@Override
	public void evaluate() {
		System.out.println("Evaluating DACDBDA Course.");
	}
}

class MSCitCourse extends Course {
	@Override
    public double getFee() {
        return 2000.00; // Example fee for MSCIT course
    }
    @Override
    public void evaluate() {
        System.out.println("Evaluating MSCIT Course.");
    }
} 


public class Ques1 {
	public static void perform(Course course) {
		course.start();
		System.out.println("Course Fee: " + course.getFee());
		course.evaluate();
	}
	public static void main(String args[]) {
		Course dacdbda = new DACDBDACourse();
		Course msCit = new MSCitCourse(); // Create an instance of MSCitCourse
        System.out.println("Performing DACDBDA Course:");
        perform(dacdbda); // Late binding occurs here
        System.out.println("\nPerforming MSCIT Course:");
        perform(msCit); // Late binding occurs here
	}
}
