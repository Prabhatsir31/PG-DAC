import Employee from "./Employee.mjs";

export class PermanentEmployee extends Employee
{
    #Designation; 
    #Department;
    #Experience;
    
    constructor(fname , lname , salary, designation, department, experience )
    {
        super(fname, lname, salary); // Call parent constructor to initialize common fields
        this.Designation = designation; // Calls setter for designation
        this.Department = department;   // Calls setter for department
        this.Experience = experience;   // Calls setter for experience
    }

    //setter for designation
    set Designation(value)
    {
        this.#Designation = value;
    }
    //getter for designation
    get Designation()
    {
        return this.#Designation;
    }

    //setter for department
    set Department(value)
    {
        this.#Department = value;
    }
    //getter for department
    get Department()
    {
        return this.#Department;
    }

    //setter for experience
    set Experience(value)
    {
        this.#Experience = value;
    }
    //getter for experience
    get Experience()
    {
        return this.#Experience;
    }

    // Method to display employee details
    toString()
    {
        return super.toString() + " Designation:" + this.#Designation + " Department:" + this.#Department + " Experience:" + this.#Experience;
    }

    // Method to calculate the bonus based on experience
    calculateBonus()
    {
        if (this.#Experience < 2)
            Salary *= 0.05; // 5% bonus for less than 2 years of experience
        else if (this.#Experience < 5)
            Salary *= 0.10; // 10% bonus for 2-5 years of experience
        else
            Salary *= 0.15; // 15% bonus for more than 5 years of experience
    }
}