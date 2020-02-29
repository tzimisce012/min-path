package triangle

object Main extends App {

  val triangle = args.map(row => row.split("\\s+").map(_.toInt))

  triangle
    .zipWithIndex
    .foreach { case (row, index) =>
      assert(row.length == index + 1, s"This is not a triangle. You can find a problem in row ${index + 1}")
    }

  val (value, path)= Triangle.findMinimumPath(triangle)
  val pathString = path.mkString(" + ")

  println(s"Minimal path is: $pathString = $value")

}
