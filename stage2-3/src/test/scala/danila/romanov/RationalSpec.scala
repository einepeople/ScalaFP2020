package danila.romanov

import org.scalatest.{FlatSpec, Matchers}

class RationalSpec extends FlatSpec with Matchers {
  "+" should "be something-something" in {
    val isEqual = Rational(1,2) + Rational(1,3) == Rational(5,6)
    isEqual shouldBe true
  }

  "==" should "be correct for 2/1 and 4/2" in {
    val isEqual = Rational(2, 1) == Rational(4, 2)
    isEqual shouldBe true
  }
  "*" should "be correct for 2/3 / 3/5 = 2/5" in {
    val isEqual = Rational(2,3) * Rational (3,5) == Rational(2,5)
    isEqual shouldBe true
  }
  "unapply" should "be correct for unapply(Rational(4,2)) == 2,1" in {
    val Rational(a,b) = Rational(4,2)
    val isCorrect = a == 2 && b == 1
    isCorrect shouldBe true
  }
}
