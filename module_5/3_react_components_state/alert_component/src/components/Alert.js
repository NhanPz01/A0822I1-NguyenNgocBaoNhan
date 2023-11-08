import { useEffect, useState } from "react"

export default function Alert() {
  const [count, setCount] = useState(0)



  useEffect( () => {
    setInterval( () => {
      setCount(count + 1)
    }, 1000)
  }, [count])
  
  return (
    <>
      <div className="alert alert-danger" role="alert">
        Cảnh báo {count}! Tài nguyên bạn vừa truy cập không tồn tại.
      </div>
    </>
  )
}