let maximum = 20

console.log("Fibonacci numbers: " + getFibonacciNumbers(maximum));
console.log("Sum of them is: " + getSum(getFibonacciNumbers(maximum)))

// Generate a fabonacci numbers lower than maximum allowed
function getFibonacciNumbers(maximum) {
  let result = [0, 1]
  while (result[result.length - 1] + result[result.length - 2] < maximum) {
    result.push(result[result.length - 1] + result[result.length - 2])
  }
  return result
}

function getSum(numbers) {
  return numbers.reduce((sum, value) => {
    return sum + value
  }, 0)
}