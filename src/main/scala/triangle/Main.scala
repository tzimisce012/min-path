package triangle

object Main extends App {

  val triangle = args(0)
    .split("\n")
    .map(row => row.split("\\s+").map(_.toInt))

  val solution = Triangle.findMinimumPath(triangle)
  val path = solution.mkString(" + ")

  println(s"Minimal path is: ${path} = ${solution.sum}")

}
