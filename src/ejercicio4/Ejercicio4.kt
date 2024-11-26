package ejercicio4

fun main() {
    val atleta = arrayOf("correr", "correr", "correr", "saltar", "correr")
    val pista = "_|_|_"

    val resultado = evaluarCarrera(atleta, pista)
    println("Carrera superada: ${resultado.first}")
    println("Pista modificada: ${resultado.second}")
}

fun evaluarCarrera(atleta: Array<String>, pista: String): Pair<Boolean, String> {

    var pistaArray = pista.toCharArray()
    var success = true

    for (i in atleta.indices) {
        if (i >= pistaArray.size) {
            pistaArray += '?'
            success = false
        } else {
            when {
                atleta[i] == "correr" && pistaArray[i] == '_' -> pistaArray[i] = '_'
                atleta[i] == "saltar" && pistaArray[i] == '|' -> pistaArray[i] = '|'

                // If atleta is jumping in floor segment
                atleta[i] == "saltar" && pistaArray[i] == '_' -> {
                    pistaArray[i] = 'x'
                    success = false
                }
                // If atleta is running and there is a wall
                atleta[i] == "correr" && pistaArray[i] == '|' -> {
                    pistaArray[i] = '/'
                    success = false
                }
                else -> {
                    pistaArray[i] = '?'
                    success = false
                }
            }
        }
    }

    // If atleta is smaller than pista, fill with '?'
    if (atleta.size < pistaArray.size) {
        //Gets the remaining elements of the pista array by getting the difference between the sizes
        for (i in atleta.size..<pistaArray.size) {
            pistaArray[i] = '?'
            success = false
        }
    }

    val pistaModificada = pistaArray.concatToString()
    return Pair(success, pistaModificada)
}