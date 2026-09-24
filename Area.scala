import scala.io.StdIn

object Area {
  def main(args: Array[String]): Unit = {

    println("Enter length:")
    val l = StdIn.readInt()

    println("Enter breadth:")
    val b= StdIn.readInt()

    println(s"Area: ${l*b}")
  }
}