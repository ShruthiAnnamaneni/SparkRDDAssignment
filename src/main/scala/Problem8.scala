import org.apache.spark.SparkContext

object Problem8 {
  def main(args:Array[String]):Unit={
    //8.Use flatMap() on an RDD containing sentences and split them into words.
    //val data = List("Big Data is powerful", "Spark makes processing faster")
        val sc=new SparkContext("local[*]","bigdata")
        val data = List("Big Data is powerful", "Spark makes processing faster")
        val rdd = sc.parallelize(data)
        val rdd1 = rdd.flatMap(x => x.split(" "))
        rdd1.collect().foreach(println)
  }

}
