import org.apache.spark.SparkContext

object Problem22 {
  def main(args:Array[String]):Unit={
    //22.Apply countByKey() on a key-value RDD containing city names and counts.
    //val data = List(("New York", 3), ("London", 2), ("New York", 5), ("Paris", 1))
    val sc=new SparkContext("local[*]","bigdata")
    val data = List(("New York", 3), ("London", 2), ("New York", 5), ("Paris", 1))
    val rdd=sc.parallelize(data)
    val result=rdd.countByKey()
    result.foreach(println)

  }

}
