object Min_Max {
  def main(args: Array[String]): Unit = {

    val arr = new Array[Int](10)

    println("Enter 10 integers:")

    for (i <- 0 until 10) {
      arr(i) = scala.io.StdIn.readInt()
    }

    println("Array elements:")

    for (i <- 0 until 10) {
      print(arr(i) + " ")
    }

    println()

    println("Maximum value = " + arr.max)
    println("Minimum value = " + arr.min)
  }
}