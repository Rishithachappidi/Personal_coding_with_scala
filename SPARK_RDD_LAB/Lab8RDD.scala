import org.apache.spark.rdd.RDD

object Lab8RDD {

  def run(sc: org.apache.spark.SparkContext): Unit = {

    val salesRDD: RDD[Int] =
      sc.parallelize(List(850, 1250, 2100, 950, 1750, 600))

    // Transformation 1
    val highSalesRDD =
      salesRDD.filter(amount => amount > 1000)

    // Transformation 2
    val categorizedRDD =
      highSalesRDD.map(amount => ("High", amount))

    // Transformation 3 - causes a shuffle
    val totalSalesRDD =
      categorizedRDD.reduceByKey((a, b) => a + b)

    // Actions
    val highSalesCount = highSalesRDD.count()
    val firstHighSale = highSalesRDD.first()
    val highSalesList = highSalesRDD.collect()
    val totalSales = totalSalesRDD.collect()
    println("\nOriginal sales:")
    salesRDD.collect().foreach(println)
    println("\nSales above 1000:")
    highSalesList.foreach(println)
    println("\nCategorized sales:")
    categorizedRDD.collect().foreach(println)

    println("\nTotal sales:")
    totalSales.foreach(println)

    println("\nNumber of high-sales days:")
    println(highSalesCount)

    println("\nFirst high sale:")
    println(firstHighSale)

   
  }
}