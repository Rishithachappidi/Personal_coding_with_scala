
object ListMapSetTuple {
  def main(args: Array[String]): Unit = {
    var students = Map[Int, Any]()
    var highScorers = Set[String]()
    for (i <- 1 to 4) {
      print("Roll Number: ")
      val rollNo = scala.io.StdIn.readInt()
      print("Name: ")
      val name = scala.io.StdIn.readLine()
      print("Marks in Subject 1: ")
      val mark1 = scala.io.StdIn.readDouble()
      print("Marks in Subject 2: ")
      val mark2 = scala.io.StdIn.readDouble()
      val total = mark1 + mark2
      val average = total / 2
      students += (rollNo -> (name, mark1, mark2, total, average))
      if (mark1 > 90 || mark2 > 90) {
        highScorers += name
      }
    }
    println("Student Details:")
    for ((rollNo, details) <- students) {
      println(rollNo + " " + details)
    }
    println("High Scoring Students:")
    for (name <- highScorers) {
      println(name)
    }
    println("Roll Numbers:")
    for (rollNo <- students.keys) {
      println(rollNo)
    }
  }
}
//cb.ai.u4aid24109