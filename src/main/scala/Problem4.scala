import org.apache.spark.SparkContext

object Problem4 {
  def main(args: Array[String]):Unit= {
    //4.Filter an RDD to retain only even numbers.
    //val data = List(3, 6, 9, 12, 15, 18, 21, 24)
    val sc = new SparkContext("local[*]", "bigdata")
    val data = List(3, 6, 9, 12, 15, 18, 21, 24)
    val rdd = sc.parallelize(data)
    val even = rdd.filter((x => x % 2 == 0))
    even.collect().foreach(println)

  }

}

