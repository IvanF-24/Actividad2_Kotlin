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
// 10. Rotación de Turnos de Trabajo
fun reto10() {
    val empleados = listOf("Juan", "Sofía", "Pedro", "Laura", "Andrés", "Valentina", "Miguel")
    val k = 2
    val rotada = mutableListOf<String>()
    for (i in empleados.indices) {
        rotada.add(empleados[(i + k) % empleados.size])
    }

    println("\n--- Reto 10: Rotación de Turnos ---")
    println("Original: $empleados")
    println("Rotada (k=$k): $rotada")
}
// 11. Organizador de Maleta
fun reto11() {
    val objetos = listOf("Chaqueta" to 3, "Tenis" to 2, "Tablet" to 1, "Cuaderno" to 1, "Audífonos" to 2)
    val porPeso = mutableMapOf<Int, MutableList<String>>()

    for (obj in objetos) {
        porPeso.getOrPut(obj.second) { mutableListOf() }.add(obj.first)
    }

    println("\n--- Reto 11: Organizador de Maleta ---")
    println("Objetos por peso: $porPeso")
}
// 12. Verificador de Ruta Reversible
fun reto12() {
    val ruta = listOf(5 to 5, 6 to 6, 7 to 7, 6 to 6, 5 to 5)
    var esEspejo = true
    for (i in 0..<ruta.size / 2) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esEspejo = false
            break
        }
    }

    println("\n--- Reto 12: Ruta Espejo ---")
    println("¿Es espejo?: $esEspejo")
}
// 13. Reparto de Pedidos por Camión
fun reto13() {
    val paquetes = (1..50).toList().map { "Caja #$it" }
    val lotes = paquetes.chunked(10)

    println("\n--- Reto 13: Reparto de Pedidos ---")
    lotes.forEachIndexed { index, lote ->
        println("Camión ${index + 1}: ${lote.size} paquetes")
    }
}
// 14. Identificador de Ticket Único
fun reto14() {
    val tickets = listOf("TK-10", "TK-20", "TK-10", "TK-30", "TK-20", "TK-40")
    val conteo = tickets.groupingBy { it }.eachCount()
    val unico = tickets.firstOrNull { conteo[it] == 1 }

    println("\n--- Reto 14: Ticket Único ---")
    println("Primer ticket único: $unico")
}
// 15. Calculadora de IVA Selectiva
fun reto15() {
    val productos = mapOf("Queso" to 12000.0, "Pollo" to 45000.0, "Whisky" to 95000.0, "Azúcar" to 3000.0)
    val conIVA = productos.mapValues { (_, precio) ->
        if (precio > 50000) precio * 1.19 else precio
    }

    println("\n--- Reto 15: IVA Selectivo ---")
    println("Precios con IVA: $conIVA")
}
// 16. Mantenimiento de Sensores
fun reto16() {
    val sensores = mutableListOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    sensores.removeAll { it % 3 == 0 }

    println("\n--- Reto 16: Mantenimiento de Sensores ---")
    println("Sensores funcionales: $sensores")
}
// 17. Mapa de Almacén (Matriz)
fun reto17() {
    val almacen = arrayOf(
        arrayOf(6, 9, 3, 7),
        arrayOf(2, 11, 5, 4),
        arrayOf(8, 1, 14, 10),
        arrayOf(13, 0, 6, 18)
    )
    var principal = 0
    var secundaria = 0
    val n = almacen.size
    for (i in 0..<n) {
        principal += almacen[i][i]
        secundaria += almacen[i][n - 1 - i]
    }

    println("\n--- Reto 17: Matriz Almacén ---")
    println("Suma Principal: $principal, Suma Secundaria: $secundaria")
}