
import calculator.ListenerBasedCalculator
import calculator.VisitorBasedCalculator

fun main() {
    var r = ListenerBasedCalculator().eval("4+4")
    println(r)

    r = VisitorBasedCalculator().eval("1 - (2+2) * 2")
    println(r)
}