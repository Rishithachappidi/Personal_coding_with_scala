import scala.io.StdIn

object Sum {
  def main(args: Array[String]): Unit = {
    println("Enter first num:")
    val x = StdIn.readInt()

    println("Enter second num:")
    val y = StdIn.readInt()

    println(s"total: ${x + y}")
  }
}