import org.apache.spark.SparkContext

object Problem19 {
  def main(args:Array[String]):Unit={
    //19.Find the intersection of two RDDs of integers.
    //val data1 = List(1, 2, 3, 4, 5)
    //val data2 = List(3, 4, 5, 6, 7)
    val sc=new SparkContext("local[*]","bigdata")
    val data1 = List(1, 2, 3, 4, 5)
    val data2 = List(3, 4, 5, 6, 7)
    val rdd1=sc.parallelize(data1)
    val rdd2=sc.parallelize(data2)
    val result=rdd1.intersection(rdd2)
    result.collect().foreach(println)
  }

}
