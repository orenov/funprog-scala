class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y

  def + (that: Rational) =
    new Rational(numer * that.denom + denom * that.numer, denom * that.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def - (that: Rational) = this + -that

  def * (that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)

  def < (that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this < that) that else this

  override def toString = {
    val g = gcd(x, y)
    numer/g + "/" + denom/g
  }
}

val x = new Rational(1,2)
val y = new Rational(1,3)
val z = new Rational(3,2)

x + y

x < y

x max y

x * x + y * y