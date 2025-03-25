import org.apache.spark.SparkContext

object Problem20 {
  def main(args:Array[String]):Unit={
    //20.Subtract one RDD from another and return only unique elements from the first RDD.
    //val data1 = List(10, 20, 30, 40, 50)
    //val data2 = List(30, 40, 50)
    val sc=new SparkContext("local[*]","bigdata")
    val data1 = List(10, 20, 30, 40, 50)
    val data2 = List(30, 40, 50)
    val rdd1=sc.parallelize(data1)
    val rdd2=sc.parallelize(data2)
    val result=rdd1.subtract(rdd2)
    result.collect().foreach(println)

  }

}
