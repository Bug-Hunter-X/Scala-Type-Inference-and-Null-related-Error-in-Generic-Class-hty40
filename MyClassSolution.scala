```scala
class MyClass[T](val value: T) {
  def this(value: T) = this(value)
}
object Main extends App{
  val instance1 = new MyClass(10)
  val instance2 = new MyClass("hello")
  // Note: This works correctly as it creates a MyClass[Null]
  val instance3 = new MyClass[Null](null)
}
```