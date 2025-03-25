import org.apache.spark.SparkContext

object Problem27 {
  def main(args:Array[String]):Unit={
    //27.Count the number of words that contain a specific substring in an RDD of words.
    //val data = List("analytics", "data", "spark", "databricks", "database")
    val sc=new SparkContext("local[*]","bigdata")
    val data = List("analytics", "data", "spark", "databricks", "database")
    val rdd=sc.parallelize(data)
    val rdd1 = rdd.filter(x=>x.contains("data")).count()
     print(rdd1)

  }

}
