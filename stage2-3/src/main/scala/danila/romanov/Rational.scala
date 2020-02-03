package danila.romanov

class Rational private (val numer: Int, val denom: Int) {
  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def +(i: Int): Rational = this.+(Rational(i,1))

  def -(that: Rational): Rational = Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  def -(i: Int): Rational = this.-(Rational(i,1))

  def *(that: Rational): Rational = Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational = this.*(Rational(i,1))

  def /(that: Rational): Rational = Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational = this./(Rational(i,1))

  def == (other: Rational): Boolean = this.denom == other.denom && this.numer == other.numer

  override def toString: String = numer + "/" + denom
}

object Rational{
  @scala.annotation.tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def apply(n: Int, d: Int): Rational = {
    val g = gcd(n.abs, d.abs)
    require(d != 0)
    new Rational(n/g, d/g)
  }
  def unapply(r: Rational): Some[(Int, Int)] = Some((r.numer, r.denom))
}