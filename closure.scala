object DiscountCalculator {

  // Higher-order function:
  // It accepts discount percentage and RETURNS another function
  def createDiscount(discount: Double): Double => Double = {

    // Closure
    (price: Double) => price - (price * discount / 100)
  }

  def main(args: Array[String]): Unit = {

    // Creating two closures
    val discount10 = createDiscount(10)
    val discount20 = createDiscount(20)

    // Item price
    val price = 1000.0

    // Applying discounts
    val finalPrice10 = discount10(price)
    val finalPrice20 = discount20(price)

    // Display results
    println("Original Price: Rs." + price)

    println("After 10% Discount: Rs." + finalPrice10)

    println("After 20% Discount: Rs." + finalPrice20)
  }
} //cb.ai.u4aid24109