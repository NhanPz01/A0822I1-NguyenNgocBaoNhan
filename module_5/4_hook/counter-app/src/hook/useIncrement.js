import { useState } from 'react';

function useIncrement(addAmount) {
    const [count, setCount] = useState(0);
    const increase = (addAmount) => {
        setCount((prevCount) => prevCount + addAmount);
    }
    return [count, increase];
}

export default useIncrement;