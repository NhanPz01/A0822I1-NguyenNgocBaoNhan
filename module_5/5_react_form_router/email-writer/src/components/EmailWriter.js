import { Formik, Form, Field, ErrorMessage } from 'formik';
import FileUpload from './FileUpload';
import { useRef, useState } from 'react';
import * as Yup from 'yup';

const EmailWrite = () => {
  const [form, setForm] = useState(
    {
      to: '',
      title: '',
      message: '',
      files: ''
    }
  )
  const fileRef = useRef(null);

  return (
    <Formik
      initialValues={form}
      validationSchema={Yup.object(
        {
          to: Yup.string()
            .required('Email is required')
            .email('Should be a valid email address, like abc@gmail.com'),
          title: Yup.string().required('Title is required'),
          message: Yup.string().required('Message is required')
        }
      )}
      onSubmit={(values) => {
        if (values) {
          alert('Submit successful')
          console.group('Submit successful')
          console.log(values)
          console.log(fileRef.current.files)
          console.groupEnd()
          setForm({
            to: '',
            title: '',
            message: '',
            files: ''
          })
        }
      }}
    >
      <Form>
        <div className="form-group">
          <label htmlFor="exampleInputEmail1">To</label>
          <ErrorMessage component="span" name='to' className='error' />
          <Field type="email" className="form-control" name="to" id="exampleInputEmail1" />
        </div>
        <div className="form-group">
          <label htmlFor="exampleInputEmail2">Title</label>
          <ErrorMessage component="span" name='title' className='error' />
          <Field type="text" className="form-control" name="title" id="exampleInputEmail2" />
        </div>
        <div className="form-group">
          <label htmlFor="exampleInputEmail1">Message</label>
          <ErrorMessage component="span" name='message' className='error' />
          <Field as="textarea" className="form-control" name="message" id="exampleInputEmail1" />
        </div>

        <FileUpload name="files" fileRef={fileRef} />

        <button type="submit" className="btn btn-primary rounded-5">Submit</button>
      </Form>
    </Formik>
  )
}

export default EmailWrite;