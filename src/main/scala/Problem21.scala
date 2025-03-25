import org.apache.spark.SparkContext

object Problem21 {
  def main(args:Array[String]):Unit={
    //21.Generate the Cartesian product of two RDDs (one containing numbers, the other containing letters).
    //val data1 = List(1, 2, 3)
    //val data2 = List("A", "B")
    val sc=new SparkContext("local[*]","bigdata")
    val data1 = List(1, 2, 3)
    val data2 = List("A", "B")
    val rdd1=sc.parallelize(data1)
    val rdd2=sc.parallelize(data2)
    val result=rdd1.cartesian(rdd2)
    result.collect().foreach(println)

  }

}
