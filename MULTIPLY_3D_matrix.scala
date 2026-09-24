object MatrixMultiplication {
  def main(args: Array[String]): Unit = {

    val matrix1 = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )

    val matrix2 = Array(
      Array(9, 8, 7),
      Array(6, 5, 4),
      Array(3, 2, 1)
    )

    val result = Array.ofDim[Int](3, 3)

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        for (k <- 0 until 3) {
          result(i)(j) += matrix1(i)(k) * matrix2(k)(j)
        }
      }
    }

    println("Resultant Matrix:")

    for (i <- 0 until 3) {
      for (j <- 0 until 3) {
        print(result(i)(j) + " ")
      }
      println()
    }
  }
} //cb.ai.u4aid24109