import { useState } from "react"

export default function Counter() {
  const [count, setCount] = useState(0)

  const handleClick = (value) => {
    setCount( count + value)
  }

  return (
    <>
      <div>
        <div>Count: 1</div>
        <button onClick={() => handleClick(1)}>Add 1</button>
      </div>
      <br/>
      <div>
        <div>Count: 2</div>
        <button onClick={() => handleClick(2)}>Add 2</button>
      </div>
      <br/>
      <h1>{count}</h1>
      <br/>
      <button onClick={() => handleClick(-count)}>Reset</button>
    </>
  )
}