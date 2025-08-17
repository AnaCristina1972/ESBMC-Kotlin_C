class Foo {
    var A = 12

    fun foo() {}
}

fun main() {
    val test = Foo()
    assert(test.A == 11)
}
