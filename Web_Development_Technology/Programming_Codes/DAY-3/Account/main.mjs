import { Savingaccount } from "./Savingaccount.mjs";
import { Currentaccount } from "./Currentaccount.mjs";

try {
  const sa = new Savingaccount("Saving", "Domnic", "Torato", 5000);
  console.log("Saving Account Before:", sa.toString());
  sa.withdraw(3000);
  console.log("Saving Account After:", sa.toString());

  const ca = new Currentaccount("Current", "Jane", "Smith", 8000);
  console.log("Current Account Before:", ca.toString());
  ca.withdraw(7500);
  console.log("Current Account After:", ca.toString());
} catch (err) {
  console.error("Error:", err.message);
}
