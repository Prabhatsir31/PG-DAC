// Formyup.js
import React from "react";
import { useFormik } from "formik";
import FormDemo from "./FormDemo";

function Formyup() {
  const formik = useFormik({
    initialValues: {
      code: "",
      name: "",
      gender: "",
      annualSalary: "",
      dateOfBirth: "",
      EmailId: "",
    },
    validationSchema: FormDemo,
    onSubmit: (values) => {
      alert(JSON.stringify(values, null, 2));
    },
  });

  return (
    <form onSubmit={formik.handleSubmit} style={{margin:'30px 100px 75px 100px'}}>
      <h2><center><u>Registration Form</u></center></h2><br />

      <p>
        <label>
          Employee Code:
          <input type="text" {...formik.getFieldProps("code")} />
          {formik.touched.code && formik.errors.code && (
            <span style={{ color: "red" }}>{formik.errors.code}</span>
          )}
        </label>
      </p>

      <p>
        <label>
          Employee Name:
          <input type="text" {...formik.getFieldProps("name")} />
          {formik.touched.name && formik.errors.name && (
            <span style={{ color: "red" }}>{formik.errors.name}</span>
          )}
        </label>
      </p>

      <p>
        <label>
          Gender:
          <input type="text" {...formik.getFieldProps("gender")} />
          {formik.touched.gender && formik.errors.gender && (
            <span style={{ color: "red" }}>{formik.errors.gender}</span>
          )}
        </label>
      </p>

      <p>
        <label>
          Annual Salary:
          <input type="text" {...formik.getFieldProps("annualSalary")} />
          {formik.touched.annualSalary && formik.errors.annualSalary && (
            <span style={{ color: "red" }}>{formik.errors.annualSalary}</span>
          )}
        </label>
      </p>

      <p>
        <label>
          Date of Birth (YYYY-MM-DD):
          <input type="text" {...formik.getFieldProps("dateOfBirth")} />
          {formik.touched.dateOfBirth && formik.errors.dateOfBirth && (
            <span style={{ color: "red" }}>{formik.errors.dateOfBirth}</span>
          )}
        </label>
      </p>

      <p>
        <label>
          Email ID:
          <input type="text" {...formik.getFieldProps("EmailId")} />
          {formik.touched.EmailId && formik.errors.EmailId && (
            <span style={{ color: "red" }}>{formik.errors.EmailId}</span>
          )}
        </label>
      </p>

      <button type="submit">Create</button>
    </form >
  );
}

export default Formyup;
