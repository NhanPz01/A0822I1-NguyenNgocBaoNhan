import "bootstrap/dist/css/bootstrap.css"
import logo from "../assets/logo.jpg"

export default function LoginForm() {
  return (
    <>
      <div className="wrapper fadeInDown">
        <div id="formContent">
          {/* Tabs Titles */}
          {/* Icon */}
          <div className="fadeIn first">
            <img src={logo} id="icon" alt="User Icon" />
          </div>
          {/* Login Form */}
          <form>
            <input type="text" id="username" className="fadeIn second" name="username" placeholder="username" />
            <input type="text" id="password" className="fadeIn third" name="login" placeholder="password" />
            <input type="submit" className="fadeIn fourth" defaultValue="Log In" />
          </form>
          {/* Remind Passowrd */}
          <div id="formFooter">
            <a className="underlineHover" href="#">Forgot Password?</a>
          </div>
        </div>
      </div>
    </>
  )
}