import org.apache.spark.SparkContext

object Problem24 {
  def main(args:Array[String]):Unit={
    //24.Use foreach() to print all elements of an RDD in parallel.
    //val data = List("Spark", "Scala", "Hadoop", "Kafka")
    val sc=new SparkContext("local[*]","bigdata")
    val data = List("Spark", "Scala", "Hadoop", "Kafka")
    val rdd=sc.parallelize(data)
    rdd.collect().foreach(println)

  }

}
