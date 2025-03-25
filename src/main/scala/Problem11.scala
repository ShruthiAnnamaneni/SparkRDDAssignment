import org.apache.spark.SparkContext

object Problem11 {
  def main(args:Array[String]):Unit={
    //11.Create a pair RDD with student IDs and names, and apply lookup() to find a student name by ID.
    //val data = Array((101, "John"), (102, "Alice"), (103, "Bob"), (104, "David"))
    val sc=new SparkContext("local[*]","bigdata")
    val data = Array((101, "John"), (102, "Alice"), (103, "Bob"), (104, "David"))
    val rdd=sc.parallelize(data)


  }

}
