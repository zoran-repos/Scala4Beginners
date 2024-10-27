@main def functionExample(): Unit =
  val number = 5

  println(s"Factorial of $number (pure function): ${pureFactorial(number)}")

  factorialWithEffect(number)

  println(s"The $number-th Fibonacci number is: ${fibonacci(number)}")

def pureFactorial(n: Int): Int =
  if n <= 1 then 1
  else n * pureFactorial(n - 1)

def factorialWithEffect(n: Int): Int =
  var result = 1
  for i <- 1 to n do
    result *= i
    println(s"Intermediate result at step $i: $result")
  result

def fibonacci(n: Int): Int =
  if n <= 1 then n
  else fibonacci(n - 1) + fibonacci(n - 2)
