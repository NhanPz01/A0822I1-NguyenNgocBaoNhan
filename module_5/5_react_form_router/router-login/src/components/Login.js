import { Formik, Form, Field, ErrorMessage } from "formik";
import { useNavigate } from "react-router-dom";
import * as Yup from 'yup';

const Login = () => {
  const navigate = useNavigate()

  return (
    <div>
      <h1>Login</h1>
      <Formik
        initialValues={
          {
            username: "",
            password: ""
          }
        }

        validationSchema={Yup.object(
          {
            username: Yup.string()
            .required(" is required")
            .matches('admin@gmail.com', ' is wrong'),
            password: Yup.string()
            .required(" is required")
            .matches('letmein', ' is wrong')
          }
        )}

        onSubmit={values => {
          console.log(values);
          navigate('/')
          alert('Login successful')
        }}
      >
        <Form>
          <label htmlFor="username">Username</label>
          <ErrorMessage component="span" name="username" className="error" />
          <Field type="text" name="username" placeholder="Username" id="username" />
          <br/>
          <label htmlFor="password">Password</label>
          <ErrorMessage component="span" name="password" className="error" />
          <Field type="password" name="password" placeholder="Password" id="password" />
          <br/>
          <button type="submit">Login</button>
        </Form>
      </Formik>
    </div>
  );
}

export default Login