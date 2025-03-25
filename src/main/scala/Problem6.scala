import org.apache.spark.SparkContext

object Problem6 {
  //6.Count the number of elements in an RDD.
  //val data = List("Scala", "Spark", "Hadoop", "Hive", "Scala", "Spark")
  def main(args:Array[String]):Unit={
    val sc=new SparkContext("local[*]","bigdata")
    val data = List("Scala", "Spark", "Hadoop", "Hive", "Scala", "Spark")
    val rdd=sc.parallelize(data)
    val rdd1=rdd.count()
    println(rdd1)
  }

}
