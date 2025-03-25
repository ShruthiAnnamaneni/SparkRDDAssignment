import org.apache.spark.SparkContext

object Problem16 {
  def main(args:Array[String]):Unit={
    //16.Perform a leftOuterJoin() on two RDDs representing employees and their department details.
    //val employees = Array((1, "John"), (2, "Alice"), (3, "Bob"))
    //val departments = Array((1, "IT"), (2, "HR"))
    val sc=new SparkContext("local[*]","bigdata")
    val employees = Array((1, "John"), (2, "Alice"), (3, "Bob"))
    val departments = Array((1, "IT"), (2, "HR"))
    val rdd1=sc.parallelize(employees)
    val rdd2=sc.parallelize(departments)
    val leftOuter=rdd1.leftOuterJoin(rdd2)
    leftOuter.collect().foreach(println)

  }

}
