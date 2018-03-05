Scala learning
---

Vals and Vars
--

There are two types of variables.
* Variable (var) - mutable
* Value (val) - immutable

```scala
val name : String = "Jan"
val age = 12

var nameMutable: String = "Jan"
nameMutable = "Jan Novak"
```

Basic structures
--

Basic control structures are if, for, match, try and block.

```scala
val x: Int = 7;
val y: Int = 10;
val max: Int = if (x > y) x else y

val numbers : Array[Int] = Array(1, 9, 6, 9, 2)
for(i <- numbers) {
  println(i)
}
```

For can produce collection by the keyword yield.
```scala
val numbersSquare = for(i <- numbers) yield i * i
numbersSquare.foreach(n => println(n))
```