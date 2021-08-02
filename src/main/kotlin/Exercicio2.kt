fun main() {
    print(analisarTexto("EVERTON", "ANTUNES"))
}

fun analisarTexto(texto1: String, texto2: String): Boolean {
    var iguais = false

    if (texto1 != texto2) {
        iguais = true

    }

    return (iguais)
}



