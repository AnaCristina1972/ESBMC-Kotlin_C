class Foo {
    var id: Int = 389
    var age : Int = 25
}
fun main() {
    val p1 = Foo()
    assert(p1.age == 23, {"Age should be 25"})
}
