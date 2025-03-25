import org.apache.spark.SparkContext

object Problem12 {
  def main(args:Array[String]):Unit={
    //12.Given an RDD of (word, 1) pairs, apply reduceByKey() to count the frequency of each word.
    //val data = Array("apple", "banana", "apple", "orange", "banana", "apple")
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array("apple", "banana", "apple", "orange", "banana", "apple")
    val rdd=sc.parallelize(data)
    val rdd1=rdd.map(x=>(x,1))
    val rdd2=rdd1.reduceByKey((x,y)=>x+y)
    rdd2.collect().foreach(println)

  }

}
