import { useEffect, useState } from "react"
import Home from "./Home"


export default function Login() {
  const [form, setForm] = useState(
    {
      email: "",
      password: "",
      isRemember: false
    }
  )
  const [isLogin, setIsLogin] = useState(false)
  const [isValid, setIsValid] = useState(false)
  const validAccounts = {
    email: 'a@b',
    password: '123'
  }

  useEffect( () => {
    alert('Default account is e: ' + validAccounts.email + ' p: ' + validAccounts.password)
  })

  const handleChange = (property, value) => {
    setForm(() => {
      return {
        ...form,
        [property]: value
      }
    })
  }

  const handleChangeCheckbox = () => {
    setForm(() => {
      form.isRemember = !form.isRemember
      return form
    })
  }

  const checkValidForm = () => {
    const { email, password } = form
    if (email === validAccounts.email && password === validAccounts.password) {
      setIsValid(true)
    } else {
      setIsValid(false)
      alert('Your email or password is incorrect')
    }
    console.log(form);
  }

  const handleSubmit = () => {
    checkValidForm()
    if (isValid) {
      setIsLogin(true)
    }
  }

  const handleLogOut = () => {
    setForm(() => {
      return {
        email: "",
        password: "",
        isRemember: false
      }
    })
    setIsLogin(false)
  }

  if (isLogin) {
    return <Home onLogOut={handleLogOut} />
  }

  return (
    <>
      <div className="container d-flex align-items-center text-center">
        <div className="form-signin">
          <form>
            <img className="mb-4" src="https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Bootstrap_logo.svg/2560px-Bootstrap_logo.svg.png" alt="" width="72" height="57" />
            <h1 className="h3 mb-3 fw-normal">Please sign in</h1>
            <div className="form-floating">
              <input className="form-control email" type="email" name="email" placeholder="name@example.com" value={form.email} onChange={(event) => handleChange('email', event.target.value)} />
              <label>Email address</label>
            </div>
            <div className="form-floating">
              <input className="form-control password" type="password" name="password" placeholder="Password" value={form.password} onChange={(event) => handleChange('password', event.target.value)} />
              <label>Password</label>
            </div>
            <div className="checkbox mb-3">
              <label>
                <input type="checkbox" name="isRemember" value={form.isRemember} onChange={handleChangeCheckbox} /> Remember me
              </label>
            </div>
            <button className="w-100 btn btn-lg btn-primary" type="button" onClick={handleSubmit} >Sign in</button>
            <p className="mt-5 mb-3 text-muted">© 2017–2021</p>
          </form>
        </div>
      </div>
    </>
  )
}