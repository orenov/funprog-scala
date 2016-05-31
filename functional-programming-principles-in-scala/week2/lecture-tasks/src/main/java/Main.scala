/**
 * Created by oleksiirenov on 5/31/16.
 */
object Main {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }

    loop(a, 0)
  }

  def sumInts(a: Int, b: Int) = sum(x => x, a, b)
}
