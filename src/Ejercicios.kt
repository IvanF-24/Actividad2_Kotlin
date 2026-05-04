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
// 2. Filtro de empleados senior
fun reto2() {
    val empleados = listOf("Luis" to 22, "María" to 45, "Jorge" to 38, "Camila" to 29, "Andrés" to 33)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("\n--- Reto 2: Filtro Senior ---")
    println("Empleados Senior: $seniorNames")
}
// 3. Limpieza de Contactos Duplicados
fun reto3() {
    val contactos = listOf("301555", "312888", "301555", "323999", "312888", "355222", "301555")
    val unicos = contactos.toSet().sorted()

    println("\n--- Reto 3: Agenda Limpia ---")
    println("Contactos únicos ordenados: $unicos")
}
// 4. Análisis de Carrito de Compras
fun reto4() {
    val carrito = listOf("Arroz", "Pollo", "Arroz", "Papas", "Pollo", "Arroz", "Jugo")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }

    println("\n--- Reto 4: Carrito de Compras ---")
    println("Conteo: $conteo")
}
// 5. Historial de Navegación Reversible
fun reto5() {
    val historial = arrayOf("youtube.com", "wikipedia.org", "reddit.com", "twitter.com", "netflix.com")
    val invertido = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertido[i] = historial[historial.size - 1 - i]
    }

    println("\n--- Reto 5: Historial Reversible ---")
    println("Original: ${historial.joinToString()}")
    println("Invertido: ${invertido.joinToString()}")
}
// 6. Compatibilidad de Intereses (Match)
fun reto6() {
    val interesesP1 = setOf("Tecnología", "Videojuegos", "Fotografía", "Café")
    val interesesP2 = setOf("Fotografía", "Café", "Fitness", "Emprendimiento")

    val comunes = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)

    println("\n--- Reto 6: Match de Intereses ---")
    println("Comunes: $comunes")
    println("Solo Persona 1: $exclusivosP1")
}
// 7. Inventario de Despensa
fun reto7() {
    val despensa = mutableMapOf("Pasta" to 4, "Atún" to 3, "Jugo" to 2)

    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        if (actual > 0) {
            val nuevo = actual - cantidad
            if (nuevo <= 0) {
                despensa.remove(producto)
                println("¡Alerta! $producto se ha agotado.")
            } else {
                despensa[producto] = nuevo
            }
        }
    }

    println("\n--- Reto 7: Inventario Despensa ---")
    println("Inicial: $despensa")
    consumir("Jugo", 2)
    consumir("Pasta", 1)
    println("Final: $despensa")
}
// 8. Cálculo de Promedio Académico
fun reto8() {
    val notas = listOf(3.9 to 0.3, 4.7 to 0.4, 3.5 to 0.3)
    var notaFinal = 0.0
    for (par in notas) {
        notaFinal += par.first * par.second
    }

    println("\n--- Reto 8: Promedio Académico ---")
    println("Nota Final: $notaFinal")
}
// 9. Traductor de Códigos de País
fun reto9() {
    val paises = mapOf("US" to "Estados Unidos", "BR" to "Brasil", "CL" to "Chile", "PE" to "Perú")

    println("\n--- Reto 9: Traductor de Países ---")
    for ((codigo, nombre) in paises) {
        println("El código [$codigo] pertenece a [$nombre]")
    }
}
