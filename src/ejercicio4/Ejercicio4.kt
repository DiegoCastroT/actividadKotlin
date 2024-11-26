package ejercicio4

fun main() {

    val atleta = arrayListOf("Correr", "Saltar", "Correr", "Saltar", "Correr")
    val pista = "_|_|_"

    println("$pista ${checkRace(atleta, pista)}")
}

fun checkRace(atleta: ArrayList<String>, pista: String): Boolean {

    if (atleta.size != pista.length) return false

    for (i in atleta.indices) {
        if (atleta[i].equals("Correr")) {
            if (pista[i] == '_') {
                continue
            } else {
                return false
            }
        } else if (atleta[i].equals("Saltar")) {
            if (pista[i] == '|') {
                continue
            } else {
                return false
            }
        } else {
            return false
        }
    }
    return true
}
