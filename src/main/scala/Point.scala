class Point(val x: Double, val y: Double) {

  def distance(that: Point): Double = {
    val dX = this.x - that.x
    val dY = this.y - that.y
    math.sqrt(dX * dX + dY * dY)
  }

}

