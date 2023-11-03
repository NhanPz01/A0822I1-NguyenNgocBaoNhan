import Content from "./Content"
import { useState } from "react" 

export default function MainPage() {
  const [isDisplay, setIsDisplay] = useState(false)
  return (
    <div>
      <button className="btn btn-success w-100 rounded-top-0 rounded-bottom-5" onClick={() => setIsDisplay(!isDisplay)}>Xem giới thiệu</button>
      <br/>
      <br/>
      <Content isDisplay={isDisplay} />
    </div>
  )
}