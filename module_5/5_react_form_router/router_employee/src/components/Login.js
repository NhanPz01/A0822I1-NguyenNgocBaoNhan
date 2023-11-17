import { Formik, Form, Field, ErrorMessage } from "formik";
import { useNavigate } from "react-router-dom";
import * as Yup from 'yup';

const Login = () => {
  const navigate = useNavigate()
  const account = {
    username: 'admin@gmail.com',
    password: 'letmein',
    displayName: 'ADMIN'
  }


  return (
    <>
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
                .matches(account.username, ' is wrong'),
              password: Yup.string()
                .required(" is required")
                .matches(account.password, ' is wrong')
            }
          )}

          onSubmit={values => {
            console.log(values);
            alert('Login successful')
            navigate('/employee')
          }}
        >
          <Form>
            <div className="form-group">
              <label htmlFor="username">Username</label>
              <ErrorMessage component="span" name="username" className="error" />
              <Field type="text" name="username" placeholder="Username" className="form-control" id="username" />
            </div>
            <br />
            <div className="form-group">
              <label htmlFor="password">Password</label>
              <ErrorMessage component="span" name="password" className="error" />
              <Field type="password" name="password" placeholder="Password" className="form-control" id="password" />
            </div>
            <br />
            <button type="submit" className="btn btn-outline-secondary w-100 rounded-0">Login</button>
          </Form>
        </Formik>
      </div>
    </>
  )
}

export default Login;