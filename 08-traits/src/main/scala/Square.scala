class Square(size:Int ) extends Shape {

  override def toString: String = {
    return "[Square (size=" + size + ")]"
  }

  def getSize() = size

}

