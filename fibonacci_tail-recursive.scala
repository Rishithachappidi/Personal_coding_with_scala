import scala.annotation.tailrec

object Fibonacci {

  @tailrec
  def fibonacci(n: Int, a: Int = 0, b: Int = 1): Int = {
    if (n == 0)
      a
    else
      fibonacci(n - 1, b, a + b)
  }

  def main(args: Array[String]): Unit = {

    val n = 10

    val result = fibonacci(n)

    println("The " + n + "th Fibonacci number is: " + result)
  }
}