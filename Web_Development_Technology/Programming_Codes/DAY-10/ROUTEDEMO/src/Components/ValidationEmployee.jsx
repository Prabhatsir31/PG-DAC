import React from "react";
import { useFormik } from "formik";
import FormDemo from "./FormDemo";

function ValidationEmployee() {
  const formik = useFormik({
    initialValues: {
      code: "",
    //   name: "",
    //   gender: "",
    //   annualSalary: "",
    //   dateOfBirth: "",
    //   EmailId: "",
    },
    validate: ValidationEmployee,
    onSubmit: (values) => {
      ValidationEmployee();
      alert(JSON.stringify(values));
    },
  });
  const ValidationEmployee = (empdata) => {
    const errors = {};
    if (!empdata.code) {
      errors.code = "Please Emter Employee code";
    } else if (empdata.code.length < 3) {
      errors.code = "code is 3 digit";
    }
    return errors;
  };

  return (
    <div>
      <form onSubmit={formik.handleSubmit}>
        <p>
          <label>
            Employee Code:
            <input
              type="text"
              name="code"
              value={formik.values.code}
              onChange={formik.handleChange}
              onBlur={formik.handleBlur}
            ></input>
            {formik.touched.code && formik.errors.code ? (
              <span style={{ color: "red" }}> {formik.errors.code}</span>
            ) : null}
          </label>
        </p>
      </form>
    </div>
  );
}

export default ValidationEmployee;
