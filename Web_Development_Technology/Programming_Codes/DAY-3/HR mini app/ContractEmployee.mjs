import Employee  from "./Employee.mjs";
export class ContractEmployee extends Employee
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

     toString()
     {
         return super.toString() + " Designation:" + this.#Designation + " Department:" + this.#Department + " Experience:" + this.#Experience;
     }
}