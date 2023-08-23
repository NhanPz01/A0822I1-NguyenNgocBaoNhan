import useIncrement from "../hook/useIncrement.js";
import React from 'react';

function Counter1() {
    const [count, setCount] = useIncrement();

    const handleBtnIncrement = () => {
        setCount(1)
    }

    return (
        <div className="counter-1">
            <p>Count: {count}</p>
            <br />
            <button onClick={handleBtnIncrement}>Add 1</button>
        </div>
    )
}

export default Counter1;