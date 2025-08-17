class FooTrue {
    var A = 12

    fun foo() {}
}

fun main() {
    val test = FooTrue()
    assert(test.A == 12)
}
