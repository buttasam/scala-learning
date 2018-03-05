/**
  * @author Samuel Butta
  */
object Main {

  def main(args: Array[String]): Unit = {
    variables()
    basicStructures()
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

}
