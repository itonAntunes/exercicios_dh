fun main() {
    print(analisarNumeroPar(4))
}

fun analisarNumeroPar(numero: Int): Boolean {
    var par = false

    if (numero % 2 == 0) {
        par = true

    }

    return (par)
}
