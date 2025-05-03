// Q8. Write class employee having property Id, Name Salary and create 2 object and print its value using toString method

class Employee {
  constructor(id, name, salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  toString() {
    return `Employee ID: ${this.id}, Name: ${this.name}, Salary: ${this.salary}`;
  }
}

const emp1 = new Employee(1, "Prabhat Srivastava", 50000);

console.log(emp1.toString());

const emp2 = new Employee(2, "Domnik Torato", 60000);

console.log(emp2.toString());
