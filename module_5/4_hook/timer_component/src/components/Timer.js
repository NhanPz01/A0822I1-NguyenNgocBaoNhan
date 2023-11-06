import { useEffect, useState } from "react"


export default function Timer() {
  const [timer, setTimer] = useState(10)

  useEffect(() => {
    let interval = setInterval( () => {
      if (timer === 0) {
        alert("Time's up!")
        clearInterval(interval)
      } else {
        setTimer(timer - 1)
      }
    }, 1000)
    return () => clearInterval(interval)
  }, [timer])

  return (
    <>
      <h1>Count down for {timer}</h1>
    </>
  )
}