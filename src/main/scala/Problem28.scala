import org.apache.spark.SparkContext

object Problem28 {
  def main(args:Array[String]):Unit={
    //28.Implement a word count problem and return the 5 most frequent words in an RDD of sentences.
    //val data = List("Spark is great", "Big Data is powerful", "Spark makes Big Data easy")
    val sc=new SparkContext("local[*]","bigdata")
    val data = List("Spark is great", "Big Data is powerful", "Spark makes Big Data easy")
    val rdd=sc.parallelize(data)
    val rdd1=rdd.flatMap(x=>x.split(" "))
    val rdd2=rdd1.map(x=>(x,1))
    val rdd3=rdd2.reduceByKey((x,y)=>x+y)
    val rdd4 = rdd3.sortBy(x=>x._2,false)
    rdd4.take(5).foreach(println)
  }

}
