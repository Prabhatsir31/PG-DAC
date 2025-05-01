import { ContractEmployee } from "./ContractEmployee.mjs";
import { PermanentEmployee } from "./PermanentEmployee.mjs";

const cemp = new ContractEmployee("Aakash", "Nerkar", 50000, "Developer", "IT", 2);
console.log(cemp.toString());
const pemp = new PermanentEmployee("Krishna", "Sonewane", 100000, "Food Inspector", "Food", 3);
console.log(pemp.toString());

cemp.Salary = 60000; // Use the Salary setter
console.log(cemp.toString());
cemp.Salary = 70000; // Use the Salary setter
console.log(cemp.toString());
cemp.Salary = 80000; // Use the Salary setter
console.log(cemp.toString());
cemp.Salary = 90000; // Use the Salary setter
console.log(cemp.toString());

pemp.Salary = 110000; // Use the Salary setter
console.log(pemp.toString());
pemp.Salary = 120000; // Use the Salary setter
console.log(pemp.toString());
pemp.Salary = 130000; // Use the Salary setter
console.log(pemp.toString());
pemp.Salary = 140000; // Use the Salary setter
