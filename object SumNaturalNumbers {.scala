object SumNaturalNumbers {

  // Tail-recursive function
  def sum(n: Int, accumulator: Int = 0): Int = {
    if (n == 0)
      accumulator
    else
      sum(n - 1, accumulator + n)
  }

  def main(args: Array[String]): Unit = {

    val n = 10

    val result = sum(n)

    println("Sum of first " + n + " natural numbers = " + result)
  }
} //cb.ai.u4aid24109