object MatrixAddition {
  def main(args: Array[String]): Unit = {

    val matrix1 = Array(
      Array(1, 2),
      Array(3, 4)
    )

    val matrix2 = Array(
      Array(5, 6),
      Array(7, 8)
    )

    val result = Array.ofDim[Int](2, 2)

    for (i <- 0 until 2) {
      for (j <- 0 until 2) {
        result(i)(j) = matrix1(i)(j) + matrix2(i)(j)
      }
    }

    println("Resultant Matrix:")

    for (i <- 0 until 2) {
      for (j <- 0 until 2) {
        print(result(i)(j) + " ")
      }
      println()
    }
  }
} //cb.ai.u4aid24109