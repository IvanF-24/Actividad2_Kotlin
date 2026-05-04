// 1. Control de Gastos Diarios
fun reto1() {
    val gastos = arrayOf(60.0, 18.0, 25.5, 90.0, 12.0, 8.5, 70.0, 33.0, 20.0, 55.0, 45.0, 10.0, 95.0, 22.0, 38.0)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > max) max = gasto
        if (gasto < min) min = gasto
    }
    val promedio = total / gastos.size

    println("--- Reto 1: Control de Gastos ---")
    println("Total: $total, Promedio: $promedio, Máximo: $max, Mínimo: $min")
}
fun reto2() {
    val empleados = listOf("Luis" to 22, "María" to 45, "Jorge" to 38, "Camila" to 29, "Andrés" to 33)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("\n--- Reto 2: Filtro Senior ---")
    println("Empleados Senior: $seniorNames")
}
