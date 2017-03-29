import org.apache.spark.sql.SparkSession

/**
  * Created by mauricio on 3/28/17.
  */

object HelloSpark {
  val ss = SparkSession
    .builder
    .master("local[2]") // create a local cluster with 2 nodes
    .appName("Hello Spark")
    .getOrCreate()
  val sc =ss.sparkContext
  val sqlContext = ss.sqlContext

  def wordCounts = {
    val textFile = sc.textFile("README.md")
    val counts = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    println("Word Counts in README.md")
    println(counts.collect().mkString("\n"))
  }

}
