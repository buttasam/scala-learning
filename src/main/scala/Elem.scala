abstract class Elem {

  val content : List[String]

  def w : Int = content.head.size
  def h : Int = content.size

  override def toString: String = content.mkString("\n")


  def above(that: CharElem): ListElem = new ListElem(that.content ++ content)

  def beside(that: CharElem) : ListElem = {
    new ListElem((that.content zip this.content).map((s) => s._1 + s._2))
  }

}


class CharElem(val char : Char, val weight : Int, val height : Int) extends Elem {

    override val content: List[String] = (for(t <- 1 to height) yield char.toString * weight).toList

}

class ListElem(val contents : List[String]) extends Elem {

   override val content: List[String] = contents

}