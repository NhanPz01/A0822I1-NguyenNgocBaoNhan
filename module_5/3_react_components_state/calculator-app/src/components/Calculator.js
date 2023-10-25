import { useState } from "react"

export default function Calculator() {
  const [result, setResult] = useState('');
  const [input1, setInput1] = useState('');
  const [input2, setInput2] = useState('');

  const resetInput = () => {
    setInput1('')
    setInput2('')
    setResult('')
  }

  const handleSum = () => {
    setResult(input1 + input2);
  }
  const handleSubtract = () => {
    setResult(input1 - input2);
  }
  const handleMultiply = () => {
    setResult(input1 * input2);
  }
  const handleDivine = () => {
    setResult(input1 / input2);
  }

  return (
    <>
      <div className="calculator card">
        <input type="number" id="first-number" className="calculator-input z-depth-1" placeholder="Number 1" value={input1} onChange={(element) => setInput1(Number(element.target.value))} />
        <input type="number" id="second-number" className="calculator-input z-depth-1" placeholder="Number 2" value={input2} onChange={(element) => setInput2(Number(element.target.value))} />
        <input type="text" className="calculator-screen z-depth-1" placeholder="Result" value={result} readOnly />
        <div className="calculator-keys">
          <button type="button" className="operator btn btn-info" value="+" onClick={handleSum}>+</button>
          <button type="button" className="operator btn btn-info" onClick={handleSubtract} value="-">-</button>
          <button type="button" className="operator btn btn-info" onClick={handleMultiply} value="*">×</button>
          <button type="button" className="operator btn btn-info" onClick={handleDivine} value="/">÷</button>
          <button type="button" className="all-clear function btn btn-danger btn-sm" value="all-clear" onClick={resetInput}>AC</button>
        </div>
      </div>
    </>
  )
}
