package triangle

object Triangle {

  def findMinimumPath(triangle: Array[Array[Int]]): (Int, Array[Int]) = {
    val acumm = Array.fill[(Int, Array[Int])](triangle.last.length+1)((0, Array()))

    triangle.foldRight(acumm)((upper, lower) => {
      upper zip (lower zip lower.tail) map {case (above, (left, right)) =>
        val chosen = if (left._1 < right._1) left else right
        (above + chosen._1, above +: chosen._2)
      }
    }).head
  }

}
