import org.apache.spark.SparkContext

object Problem25 {
  def main(args:Array[String]):Unit={
    //25.Find the maximum and minimum values in an RDD.
    //val data = Array(500, 1000, 200, 50, 700, 900)
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array(500, 1000, 200, 50, 700, 900)
    val rdd=sc.parallelize(data)
    val max=rdd.max()
    val min=rdd.min()
    println(max)
    println(min)

  }

}
