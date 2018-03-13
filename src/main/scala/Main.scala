/**
  * @author Samuel Butta
  */
object Main {

  def main(args: Array[String]): Unit = {

    charElem()

  }

  def rac() : Unit = {
    println(Rac(1,2) * Rac(3,4))
    println(Rac(1,2) == Rac(3,4))
  }

  def variables(): Unit = {
    val name: String = "Jan"
    val age = 12

    var nameMutable: String = "Jan"
    nameMutable = "Jan Novak"
  }


  def basicStructures(): Unit = {
    val x: Int = 7;
    val y: Int = 10;
    val max: Int = if (x > y) x else y

    val numbers : Array[Int] = Array(1, 9, 6, 9, 2)
    for(i <- numbers) {
      println(i)
    }

    //for can produce collection by the keyword yield
    val numbersSquare = for(i <- numbers) yield i * i
    numbersSquare.foreach(n => println(n))
  }

  def charElem() : Unit = {
    val charElem = new CharElem('x', 5, 6)
    println(charElem)

    println(new CharElem('x', 5, 3) above new CharElem('y', 4, 2))
    println(new CharElem('x', 5, 3) beside  new CharElem('y', 4, 2))

  }

}
