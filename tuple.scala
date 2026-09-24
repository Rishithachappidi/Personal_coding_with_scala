import scala.io.StdIn

object tuple {
    def main(args: Array[String]): Unit = {
        val person = ("A",30, true )
        println(person._1)
        println(person._2)
    }
}

