object ReverseArray {
  def reverseArray(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def main(args: Array[String]): Unit = {

    val arr = Array(10, 20, 30, 40, 50, 60, 70)

    println("Original Array:")
    println(arr.mkString(" "))

    val reversed = reverseArray(arr)

    println("Reversed Array:")
    println(reversed.mkString(" "))

    println("Original Array after reversing:")
    println(arr.mkString(" "))
  }
} //cb.ai.u4aid24109