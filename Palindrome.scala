import scala.annotation.tailrec

object Palindrome {

  @tailrec
  def isPalindrome(
      str: String,
      left: Int = 0,
      right: Int = -1
  ): Boolean = {

    val r = if (right == -1) str.length - 1 else right

    if (left >= r)
      true
    else if (str(left) != str(r))
      false
    else
      isPalindrome(str, left + 1, r - 1)
  }

  def main(args: Array[String]): Unit = {

    val str = "madam"

    val result = isPalindrome(str)

    println("String: " + str)
    println("Is Palindrome: " + result)
  }
} //cb.ai.u4aid24109
