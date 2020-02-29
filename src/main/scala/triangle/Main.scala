package triangle

object Main extends App {

  val triangle = args.map(row => row.split("\\s+").map(_.toInt))

  triangle
    .zipWithIndex
    .foreach { case (row, index) => assert(row.length == index + 1, "This is not a triangle") }

  val solution = Triangle.findMinimumPath(triangle)
  val path = solution.mkString(" + ")

  println(s"Minimal path is: ${path} = ${solution.sum}")

}
