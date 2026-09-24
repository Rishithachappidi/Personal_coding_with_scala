object MatrixTranspose {
  def main(args: Array[String]): Unit = {

    val matrix = Array.ofDim[Int](3, 3)

    println("Enter 9 elements:")

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        matrix(i)(j) = scala.io.StdIn.readInt()
      }
    }

    val transpose = Array.ofDim[Int](3, 3)

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        transpose(j)(i) = matrix(i)(j)
      }
    }

    println("Original Matrix:")

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        print(matrix(i)(j) + " ")
      }
      println()
    }

    println("Transposed Matrix:")

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        print(transpose(i)(j) + " ")
      }
      println()
    }
  }
} //cb.ai.u4aid24109