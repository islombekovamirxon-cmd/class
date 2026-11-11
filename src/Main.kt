//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val car = Car()
    println(car.name)
    println(car.year)
    println(car.model)
    car.year = 2024
    println()
    println(car.year)
}