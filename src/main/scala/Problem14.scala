import org.apache.spark.SparkContext

object Problem14 {
  def main(args:Array[String]):Unit= {
    // 14.Apply sortByKey() on an RDD containing employee IDs and names to sort by employee ID.
    // val data = Array((105, "Eve"), (101, "Alice"), (103, "Bob"), (104, "David"))
    val sc = new SparkContext("local[*]", "bigdata")
    val data = Array((105, "Eve"), (101, "Alice"), (103, "Bob"), (104, "David"))
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.sortByKey()
    rdd1.collect().foreach(println)
  }
}
