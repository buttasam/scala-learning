Scala learning
---

## Vals and Vars

There are two types of variables.
* Variable (var) - mutable
* Value (val) - immutable

```scala
val name : String = "Jan"
val age = 12

var nameMutable: String = "Jan"
nameMutable = "Jan Novak"
```

## Basic structures

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

### For control

For can produce collection by the keyword yield.
```scala
val numbersSquare = for(i <- numbers) yield i * i
numbersSquare.foreach(n => println(n))
```

## Functions
Functions are introduced by the keyword _def_.
```scala
def sum(a: Int, b: Int) : Int = a + b
```

When the expression is formed by a block ({ … }) then the last expression of the block forms the function resul


### Type Inference
Scala automatically infers types of variables and functions
```scala
val a = 10 // x: Int = 10
```

However, types of formal parameters must be given explicitly.

### Classes

```scala
class Point(val x: Double, val y: Double) {

  def distance(that: Point): Double = {
    val dX = this.x - that.x
    val dY = this.y - that.y
    math.sqrt(dX * dX + dY * dY)
  }
}
```
### Objects
Represent singletons. Members are similar as in static members in Java.


### Traits

### Pattern matching

### Collections
- Mutable
- Immutable (operations produce new collection, preferred): List, Map

Common operations are defined for all collections (scala.collections.Traversable) (including arrays and strings).
Note: The infix notation of method calls is used in following examples.
- **xs foreach f** − executes function f for every element of xs,
- **xs ++ ys** − concatenation xs and ys,
- **xs map f** − collection of results of the function f that was applied to all elements in xs,
- **xs.toArray, xs.toList, xs.toSet, xs.toMap** − conversions,
- **xs.size** − number of elements,
- **xs slice (m, n)** − subcollection,
- **xs filter p** − those elements of xs that satisfy the predicate p,

``` scala
(List(1,3,6,4) ++ List(2,3))
    .map(n => n*n)
    .filter(n => n < 10)
    .foreach(n => print(n))
```
