import org.apache.spark.SparkContext

object Problem7 {
  def main(args:Array[String]):Unit={
    //7.Convert a list of strings into an RDD and apply map() to convert all words to uppercase.
    //  val data = List("hello", "world", "scala", "spark")
    val sc=new SparkContext("local[*]","bigdata")
       val data = List("hello", "world", "scala", "spark")
       val rdd=sc.parallelize(data)
       val rdd1 =rdd.map(word => word.toUpperCase)
       rdd1.collect().foreach(println)
  }

}
