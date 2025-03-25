import org.apache.spark.SparkContext
object Problem1 {
  def main(args: Array[String]): Unit = {
    //1.Create an RDD using parallelize() with a list of 10 numbers and print all elements.
    //val data = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val sc = new SparkContext("local[10]", "bigdata")
    val data = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    val rdd = sc.parallelize(data)
    rdd.collect().foreach(println)

  }
}
