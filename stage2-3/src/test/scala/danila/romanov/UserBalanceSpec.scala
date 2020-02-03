package danila.romanov

import org.scalatest.{FlatSpec, Matchers}

class UserBalanceSpec extends FlatSpec with Matchers {
  "+" should "work for 1,1,1 and 5,6,7" in {
    val UserBalance(u,g,h) = UserBalance(1,1,1) + UserBalance(5,6,7)
    u shouldEqual 6
    g shouldEqual 7
    h shouldEqual 8
  }

  "-" should "work for 2,3,4 and 1,2,3" in {
    val UserBalance(u,g,h) = UserBalance(2,3,4) - UserBalance(1,2,3)
    u shouldEqual 1
    g shouldEqual 1
    h shouldEqual 1
  }
  "unary -" should "make 1,2,3 to -1,-2,-3" in {
    val UserBalance(u,g,h) = -UserBalance(1,2,3)
    u shouldEqual -1
    g shouldEqual -2
    h shouldEqual -3
  }
}
