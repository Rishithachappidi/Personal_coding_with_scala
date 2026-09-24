```scala
object List,Map,Set,Tuple{
  def main(args: Array[String]): Unit = {
    val student = (109,"Rishitha",100.95)
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
    for (name <- highScorers) {
      println(name)
    }

    for (rollNo <- students.keys) {
      println(rollNo)
    }
  }
}
