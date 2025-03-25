import org.apache.spark.SparkContext

object Problem10 {
  def main(args:Array[String]):Unit={
    //4.Apply reduce() to find the product of all numbers in an RDD.
    //val data = List(1, 2, 3, 4, 5, 6)
    val sc=new SparkContext("local[*]","bigdata")
        val data = List(1, 2, 3, 4, 5, 6)
        val rdd=sc.parallelize(data)
        val prod_result=rdd.reduce((x,y)=>x*y)
        println(prod_result)
  }

}
