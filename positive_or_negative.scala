import scala.io.StdIn._

object positive_or_negative extends App {
  println("Enter the number: ")
  val x = readLine().toInt
  if (x > 0) {
    println(x + " IS POSITIVE")
  }
  else if (x < 0) {
    println(x + " IS NEGATIVE")
  }
  else {
    println(x + " IS ZERO")
  }
}
