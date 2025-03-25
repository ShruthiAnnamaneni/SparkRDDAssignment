import org.apache.spark.SparkContext

object Problem26 {
  def main(args:Array[String]):Unit={
    //26.Use fold() to compute the sum of all elements in an RDD.
    //val data = List(5, 10, 15, 20, 25)
    val sc=new SparkContext("local[*]","bigdata")
    val data = List(5, 10, 15, 20, 25)
    val rdd=sc.parallelize(data)
    val sum=rdd.fold(0)((x,y)=>x+y)
    println("sum of elements in RDD is "+sum)

  }

}
