fun main() {
    print(separarNumeros(numeroA = 77, numeroB = 123, numeroC = 2))
}

fun separarNumeros(numeroA: Int, numeroB: Int, numeroC: Int): Int {
    var maiorNumero = 0

    if (numeroA > numeroB) {
        maiorNumero = numeroA

    } else {
        maiorNumero = numeroB
    }

    if (maiorNumero < numeroC) {
        maiorNumero = numeroC
    }

    return (maiorNumero)
}

