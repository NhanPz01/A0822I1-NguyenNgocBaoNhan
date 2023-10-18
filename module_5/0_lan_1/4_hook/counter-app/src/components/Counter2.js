import useIncrement from "../hook/useIncrement.js";
import React from 'react';

function Counter2() {
    const [count, setCount] = useIncrement();

    const handleBtnIncrement = () => {
        setCount(2)
    }

    return (
        <div className="counter-2">
            <p>Count: {count}</p>
            <br />
            <button onClick={handleBtnIncrement}>Add 2</button>
        </div>
    )
}

export default Counter2;