object EvenOdd {
  def main(args: Array[String]): Unit = {

    val arr = new Array[Int](10)

    println("Enter 10 elements:")

    for (i <- 0 until 10) {
      arr(i) = scala.io.StdIn.readInt()
    }

    var even = 0
    var odd = 0

    for (i <- 0 until 10) {
      if (arr(i) % 2 == 0)
        even += 1
      else
        odd += 1
    }

    println("Number of even elements = " + even)
    println("Number of odd elements = " + odd)
  }
} //cb.ai.u4aid241092