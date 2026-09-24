object ThreeDArray {
  def main(args: Array[String]): Unit = {

    val arr = Array(
      Array(
        Array(1, 2, 3),
        Array(4, 5, 6),
        Array(7, 8, 9)
      ),
      Array(
        Array(10, 11, 12),
        Array(13, 14, 15),
        Array(16, 17, 18)
      ),
      Array(
        Array(19, 20, 21),
        Array(22, 23, 24),
        Array(25, 26, 27)
      )
    )

    var sum = 0

    println("All elements:")

    for (i <- 0 until 3) {
      println("Layer " + (i + 1))

      for (j <- 0 until 3) {
        for (k <- 0 until 3) {
          print(arr(i)(j)(k) + " ")
          sum += arr(i)(j)(k)
        }
        println()
      }
      println()
    }

    println("Sum of all elements = " + sum)
  }
} 