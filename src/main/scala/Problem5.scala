import org.apache.spark.SparkContext

object Problem5 {
  def main(args:Array[String]):Unit={
  //5.Remove duplicate values from an RDD containing numbers.
    //val data = Array(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9)
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9)
    val rdd=sc.parallelize(data)
    val distinct_data=rdd.distinct()
    distinct_data.collect().foreach(println)
  }
}
