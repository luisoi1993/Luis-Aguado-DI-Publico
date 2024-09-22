fun main() {
    val numero = readln().toInt()

    // 1. Par o impar
    if (numero % 2 == 0) {
        println("El número es par")
    } else {
        println("El número es impar")
    }

    // 2. Positivo, negativo o cero
    when {
        numero > 0 -> println("El número es positivo")
        numero < 0 -> println("El número es negativo")
        else -> println("El número es cero")
    }

    // 3. Número primo
    if (esPrimo(numero)) {
        println("El número es primo")
    } else {
        println("El número no es primo")
    }

    // 4. Números primos menores o iguales
    println("Primos menores o iguales a $numero:")
    for (i in 2..numero) {
        if (esPrimo(i)) {
            println(i)
        }
    }

    // 5. Factorial
    println("El factorial de $numero es: ${factorial(numero)}")

    // 6. Suma de los primeros N números naturales
    val suma = (1..numero).sum()
    println("La suma de los primeros $numero números es: $suma")

    // 7. Suma de los dígitos
    val sumaDigitos = numero.toString().map { it.toString().toInt() }.sum()
    println("La suma de los dígitos es: $sumaDigitos")

    // 8. Representación binaria
    println("El número en binario es: ${Integer.toBinaryString(numero)}")

    // 9. Representación hexadecimal
    println("El número en hexadecimal es: ${Integer.toHexString(numero)}")

    // 10. Representación octal
    println("El número en octal es: ${Integer.toOctalString(numero)}")
}

// Función para comprobar si un número es primo
fun esPrimo(numero: Int): Boolean {
    if (numero < 2) return false
    for (i in 2 until numero) {
        if (numero % i == 0) return false
    }
    return true
}

// Función para calcular el factorial de un número
fun factorial(n: Int): Long {
    return if (n == 0) 1 else n * factorial(n - 1)
}
