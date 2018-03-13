import scala.annotation.tailrec

object Rac {

  def apply(a: Int, b: Int): Rac = new Rac(a, b)

  implicit def int2Rac(i : Int) : Rac = Rac(i, 1)

  @tailrec
  def gcd(a: Int,b: Int): Int = if(b == 0) a else gcd(b, a%b)

}


class Rac(val a : Int, val b : Int) {

  import Rac.gcd

  private val aNorm = a / gcd(a, b)
  private val bNorm = b / gcd(a, b)

  def apply(a: Int, b: Int): Rac = new Rac(a, b)


  def *(r : Rac) : Rac = Rac(aNorm * r.aNorm, bNorm * r.bNorm)

  def ==(r: Rac) : Boolean = aNorm == r.aNorm && bNorm == r.bNorm

  override def toString: String = "Rac(" + aNorm + ", " + bNorm + ")"

}
