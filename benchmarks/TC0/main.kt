import java.util.Random;
fun increment(X: Int, Y: Int): Int
{
    return X + Y
}

fun main() {
    var x = Random().nextInt()
    var y = Random().nextInt()
    if (x > 0) increment(x,y)
}
