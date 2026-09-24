import scala.annotation.tailrec

object GCD {

  @tailrec
  def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      a
    else
      gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {

    val num1 = 48
    val num2 = 18

    val result = gcd(num1, num2)

    println("First number: " + num1)
    println("Second number: " + num2)
    println("GCD of " + num1 + " and " + num2 + " = " + result)
  }
} //cb.ai.u4aid24109