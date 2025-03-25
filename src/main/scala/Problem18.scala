import org.apache.spark.SparkContext

object Problem18 {
  def main(args:Array[String]):Unit={
    //18.Given two RDDs of numbers, create a new RDD containing their union.
    //val data1 = List(1, 2, 3, 4)
    //val data2 = List(3, 4, 5, 6)
    val sc=new SparkContext("local[*]","bigdata")
    val data1 = List(1, 2, 3, 4)
    val data2 = List(3, 4, 5, 6)
    val rdd1=sc.parallelize(data1)
    val rdd2=sc.parallelize(data2)
    val Union_result=rdd1.union(rdd2)
    Union_result.collect().foreach(println)

  }

}
