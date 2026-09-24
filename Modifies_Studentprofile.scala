import scala.io.StdIn
object ModifiedStudentProfile {
  def main(args: Array[String]): Unit = {
    println("Enter name:")
    val name = StdIn.readLine()
    println("Enter age:")
    val age = StdIn.readInt()
    println("Enter department:")
    val department = StdIn.readLine()
    println("Enter mobile:")
    val mobile = StdIn.readLine()     //CB.AI.U4AID24109
    println("Enter email:")
    val email = StdIn.readLine()
    println(s"STUDENT PROFILE")
    println(s"Name: $name")
    println(s"Age: $age")
    println(s"Department: $department")
    println(s"Mobile: $mobile")
    println(s"Email: $email")
  }
}