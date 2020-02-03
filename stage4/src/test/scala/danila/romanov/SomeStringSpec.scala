package danila.romanov

import org.scalatest.{FlatSpec, Matchers}

class SomeStringSpec extends FlatSpec with Matchers {
  "map" should "work for asdf and upper" in {
    SomeString("asdf").map(_.toUpperCase).getOrElse("PIDOR") == "ASDF" shouldBe true
  }

  "flatMap" should "work for T and SomeString(tolowercase)" in {
    val t:OptionString = SomeString("22OBrSpN").flatMap(i => SomeString(i.toLowerCase))
    t.getOrElse("HUY") == "22obrspn" shouldBe true
  }
  "filter" should "work for T and T.contains(T[-2:])" in {
    val t = SomeString("Nikitka")
    t.filter(i => i.contains("ka")) shouldEqual t
  }
  "filter" should "work for T and T.contains(not T)" in {
    val t = SomeString("Nikitka")
    t.filter(i => i.contains("COCK")) shouldEqual NoneString
  }
  "getOrElse" should "fucking work come on why should I write this" in {
    SomeString("SukaZaebali").getOrElse("HoroshiiCourse") == "SukaZaebali" shouldBe true
  }

}
