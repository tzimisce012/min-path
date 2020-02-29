package triangle

object Triangle {

  def findMinimumPath(triangle: Array[Array[Int]]): Array[Int] = {
    val acumm = Array.ofDim[Int](triangle.last.length+1, 0)

    triangle.foldRight(acumm)((upper, lower) => {
      upper zip (lower zip lower.tail) map {case (above, (left, right)) =>
        above +: (if (left.sum < right.sum) left else right)
      }
    }).head
  }


}
