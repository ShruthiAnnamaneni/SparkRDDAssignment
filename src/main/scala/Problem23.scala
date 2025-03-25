import org.apache.spark.SparkContext

object Problem23 {
  def main(args: Array[String]):Unit={
    //23.Implement takeOrdered() to find the top 5 smallest numbers from an RDD.
    //val data = Array(55, 20, 75, 10, 90, 5, 30)
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array(55, 20, 75, 10, 90, 5, 30)
    val rdd=sc.parallelize(data)
    val result=rdd.takeOrdered(5)
    result.foreach(println)

  }

}
