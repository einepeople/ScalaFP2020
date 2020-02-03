package danila.romanov

import org.scalatest.{FlatSpec, Matchers}

class NoneStringSpec extends FlatSpec with Matchers {
  "NoneString" should "w o r k p r o p e r l y" in {
    NoneString.filter(_.contains('a')) shouldEqual NoneString
    NoneString.map( i => if (i.contains('a')) "SOS" else "KOK") shouldEqual NoneString
    NoneString.flatMap( i => if (i.contains('a')) SomeString("SOS") else SomeString("KOK")) shouldEqual NoneString
    NoneString.getOrElse("D O O T") shouldEqual "D O O T"
  }
}
