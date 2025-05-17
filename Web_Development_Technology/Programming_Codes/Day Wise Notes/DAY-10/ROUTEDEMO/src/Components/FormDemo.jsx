// validation.js
import * as yup from "yup";

const FormDemo = yup.object({
  code: yup
    .string()
    .min(3, "Code should be at least 3 characters")
    .required("Please Enter Employee Code"),

  name: yup
    .string()
    .max(20, "Name should not exceed 20 characters")
    .required("Please Enter Employee Name"),

  gender: yup
    .string()
    .required("Please Enter Employee Gender"),

  annualSalary: yup
    .number()
    .typeError("Annual Salary must be a number")
    .required("Please Enter Employee Annual Salary"),

  dateOfBirth: yup
    .date()
    .typeError("Invalid Date Format (yyyy-mm-dd)")
    .required("Please Enter Date of Birth"),

  EmailId: yup
    .string()
    .email("Invalid Email Address")
    .required("Please Enter Email ID"),
});

export default FormDemo;
