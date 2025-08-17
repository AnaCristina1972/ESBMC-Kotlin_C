import java.util.Random;

class Foo(var member: Int)
{
    fun decrement(N: Int): Int
    {
        member = member - N
        return member
    }
}

fun main(){
    var x = Random().nextInt()
    val obj = Foo(x)
    var y = Random().nextInt()
    if (y > 0) obj.decrement(y)
}
