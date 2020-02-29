package triangle

import org.scalatest.{FlatSpec, Matchers}

class TriangleSpec extends FlatSpec with Matchers {

  behavior of "A Triangle"

  it should "find its minimum path in a trivial case" in {
    Triangle.findMinimumPath(Array(Array(4))) shouldEqual Array(4)
  }

  it should "find its minimum path" in {
    val triangle = Array(
      Array(7),
      Array(6,3),
      Array(3,8,5),
      Array(11, 2, 10, 9)
    )
    Triangle.findMinimumPath(triangle) shouldEqual Array(7, 6, 3, 2)
  }

}
