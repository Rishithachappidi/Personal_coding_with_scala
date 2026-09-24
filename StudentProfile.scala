import scala.io.StdIn
object StudentProfile {
  def main(args: Array[String]): Unit = {
    println("Name:")
    val name = StdIn.readLine()
    println("Age:")
    val age = StdIn.readInt()
    println("Department:")
    val department = StdIn.readLine()
    println("Mobile:")
    val mobile = StdIn.readLine()
    println("Email:")
    val email = StdIn.readLine()
  }
}