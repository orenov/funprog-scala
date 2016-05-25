import demo.Hello
import org.scalatest.FunSuite

/**
 * Created by oleksiirenov on 5/25/16.
 */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
