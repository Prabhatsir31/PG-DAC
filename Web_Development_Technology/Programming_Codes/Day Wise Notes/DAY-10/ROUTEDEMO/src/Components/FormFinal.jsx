import { Field, Formik , ErrorMessage , Form} from 'formik'
import React from 'react'
import * as yup from "yup";


function FormFinal() {
  return (
    
    <Formik initialValues={{Code:""}}
        validationSchema={yup.object ({
            Code: yup.string().min(3, "Code should have min 3 digit").required("please enter code")
        })}
        onSubmit={values => alert(JSON.stringify(values))}
    >
        {props =>
        (
            <div>
                <h2>Enter employee Details </h2>
                <form>
                    <h2>Form Final</h2>
                    <p>
                        <label htmlFor="Code">Employee Code</label>
                        <Field name="Code" type="text"></Field> <br />  
                        <ErrorMessage name="Code"></ErrorMessage>
                    </p>
                    <button type='submit' disabled={props.isValid == false}>Submit</button>
                </form>
            </div>
        )}
    </Formik>
  )
}

export default FormFinal