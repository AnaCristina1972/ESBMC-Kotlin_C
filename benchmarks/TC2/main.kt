import java.util.Random;
fun decrement(X: Int, Y: Int): Int
{
    return X - Y
}

fun main() {
    var x = Random().nextInt()
    var y = Random().nextInt()
    if (y > 0) decrement(x,y)
}
