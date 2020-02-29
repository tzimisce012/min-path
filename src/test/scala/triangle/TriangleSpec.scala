package triangle

import org.scalatest.concurrent.TimeLimits
import org.scalatest.time.{Millis, Span}
import org.scalatest.{FlatSpec, Matchers}

class TriangleSpec extends FlatSpec with Matchers with TimeLimits {

  behavior of "A Triangle"

  it should "find its minimum path in a trivial case" in {
    val (value, path) = Triangle.findMinimumPath(Array(Array(4)))
    value shouldBe 4
    path sameElements Array(4) shouldBe true
  }

  it should "find its minimum path" in {

    val triangle = Array(
      Array(7),
      Array(6,3),
      Array(3,8,5),
      Array(11, 2, 10, 9)
    )

    val (value, path) = Triangle.findMinimumPath(triangle)
    value shouldBe 18
    path sameElements Array(7, 6, 3, 2) shouldBe true
  }

  it must "work for a big triangle" in {
    val r = scala.util.Random
    val triangle = (for (j <- 1 to 500) yield {
      (for (i <- 1 to j) yield r.nextInt(i)).toArray
    }).toArray

    failAfter(Span(100, Millis)) {
      Triangle.findMinimumPath(triangle)
    }
  }

}
