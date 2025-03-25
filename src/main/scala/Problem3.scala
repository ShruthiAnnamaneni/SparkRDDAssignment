import org.apache.spark.SparkContext
object Problem3 {
  //3.Find the mean of an RDD using both mean() and without using mean().
  //val data = Array(5, 10, 15, 20, 25)
  def main(args: Array[String]):Unit={
    val sc=new SparkContext("local[*]","Bigdata")
    val data = Array(5, 10, 15, 20, 25)
    val rdd=sc.parallelize(data)
//   println(rdd.mean())

    val sum = rdd.reduce((x,y)=>x+y)
    val count = rdd.count()
    val avg = sum/count.toDouble
    print(avg)


  }

}
