export default class Employee 
{
    #FirstName;  
    #LastName;
    #Salary;
    #Id;
    static #eid =0; // Static private variable to generate unique IDs for each employee
    constructor(fname, lname, salary)
    {
        this.FirstName = fname; // Calls setter for firstname
        this.LastName = lname;  // Calls setter for lastname
        this.Salary= salary; // Calls setter for salary
        this.#Id = ++Employee.#eid; // Auto-increments and assigns a unique ID to this employee
    }

    // Setter for firstname
    set FirstName(value)
    {
        this.#FirstName = value;
    }
    // Getter for firstname
    get FirstName()
    {
        return this.#FirstName;
    }

    // Setter for lastname
    set LastName(value)
    {
        this.#LastName= value;
    }
    // Getter for lastname
    get LastName()
    {
        return this.#LastName;
    }

    // Setter for salary
    set Salary(value)
    {
        this.#Salary = value;
    }
    // Getter for salary
    get Salary()
    {
        return this.#Salary
    }

    // Getter for the unique employee ID (read-only)
    get gId()
    {
        return this.#Id;
    }

    // Method to display employee details
    toString()
    {
        return "Employee ID:" + this.#Id + "First Name:" + this.#FirstName + "Last Name:" + this.#LastName + "Salary:" + this.#Salary;
    }

}