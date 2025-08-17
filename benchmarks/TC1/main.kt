import java.util.Random;

class Foo(var member: Int)
{
    fun increment(N: Int): Int
    {
        member = member + N
        return member
    }
}

fun main() {
    var x = Random().nextInt()
    val obj = Foo(x)
    var y = Random().nextInt()
    if (x > 0) obj.increment(y)
}
