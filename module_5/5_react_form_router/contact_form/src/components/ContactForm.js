import { ErrorMessage, Field, Form, Formik } from 'formik';
import { useEffect, useState } from 'react';
import * as Yup from 'yup';

export default function ContactForm() {
  const [contact, setContact] = useState({})
  const validateForm = {
    name: Yup.string()
      .required(' is required'),
    email: Yup.string()
      .required(' is required')
      .matches(/^[a-zA-Z0-9+-]+@[a-zA-Z0-9-]+$/),
    phone: Yup.string()
      .required(' is required')
  }

  useEffect(() => {
    setContact({
      name: '',
      email: '',
      phone: '',
      message: ''
    })
  }, [])

  return (
    <>
      <Formik
        initialValues={contact}
        onSubmit={
          (values) => {
            console.log(values)
            alert('Add contact successfully')
          }
        }
        validationSchema={
          Yup.object(validateForm)
        }
      >
        <Form>
          <div className='form-header'>
            <h3>Contact Form</h3>
          </div>
          <div className='form-body'>
            <label htmlFor='nameContact'>Name</label>
            <ErrorMessage className="error" name='name'></ErrorMessage>
            <Field name="name" id="nameContact"></Field>
            <br />
            <label htmlFor='emailContact'>Email</label>
            <ErrorMessage className="error" name='email'></ErrorMessage>
            <Field name="email" id="emailContact"></Field>
            <br />
            <label htmlFor='phoneContact'>Phone</label>
            <ErrorMessage className="error" name='phone'></ErrorMessage>
            <Field name="phone" id="phoneContact"></Field>
            <br />
            <label htmlFor='messageContact'>Message</label>
            <Field name="message" id="messageContact"></Field>
          </div>
          <button type='submit'>Submit</button>
        </Form>
      </Formik>
    </>
  )
}