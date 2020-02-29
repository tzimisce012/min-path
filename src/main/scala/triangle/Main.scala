package triangle

object Main extends App {

  val triangle = args.map(row => row.split("\\s+").map(_.toInt))

  triangle
    .zipWithIndex
    .foreach { case (row, index) =>
      assert(row.length == index + 1, s"This is not a triangle. You can find a problem in row ${index + 1}")
    }

  val solution = Triangle.findMinimumPath(triangle)
  val path = solution.mkString(" + ")

  println(s"Minimal path is: ${path} = ${solution.sum}")

}
