import org.apache.spark.SparkContext

object Problem2 {
  def main(args: Array[String]):Unit={
    //2.Create an RDD and store its data into a given output path.
    //val data = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sc=new SparkContext("local[*]","Bigdata")
    val data = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val rdd=sc.parallelize(data)
    val rdd1=rdd.saveAsTextFile("C:/Shruthi/Documents_shruthi/Jan batch data/Problem2Output")

  }

}
