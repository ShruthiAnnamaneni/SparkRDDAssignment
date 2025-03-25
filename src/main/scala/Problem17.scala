import org.apache.spark.SparkContext

object Problem17 {
  def main(args:Array[String]):Unit={
    //17.Implement combineByKey() to find the average salary per department.
    //val data = Array(("IT", 70000), ("IT", 80000), ("HR", 60000), ("HR", 50000), ("Finance", 90000))
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array(("IT", 70000), ("IT", 80000), ("HR", 60000), ("HR", 50000), ("Finance", 90000))
    val rdd=sc.parallelize(data)



  }

}
