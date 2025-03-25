import org.apache.spark.SparkContext

object Problem13 {
  def main(args:Array[String]):Unit={
    //13.Use groupByKey() on an RDD containing (department, salary) pairs to group salaries by department.
    //val data = Array(("IT", 60000), ("HR", 50000), ("IT", 70000), ("HR", 45000), ("Finance", 80000))
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array(("IT", 60000), ("HR", 50000), ("IT", 70000), ("HR", 45000), ("Finance", 80000))
    val rdd = sc.parallelize(data)
    val rdd1 = rdd.groupByKey()
    rdd1.collect().foreach(println)
  }

}
