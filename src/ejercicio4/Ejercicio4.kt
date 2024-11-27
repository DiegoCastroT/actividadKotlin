package ejercicio4

fun main() {
    val atleta = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    val pista = "_|_|_"

    val resultado = evaluarCarrera(atleta, pista)
    print(resultado.second)
    print(" ${resultado.first}")
}

fun evaluarCarrera(atleta: Array<String>, pista: String): Pair<Boolean, String> {

    var pistaArray = pista.toCharArray()
    var success = true

    for (i in atleta.indices) {
        if (i >= pistaArray.size) {
            pistaArray += '?'
            success = false
        } else {
            when (atleta[i]) {
                "correr" -> {
                    if (pistaArray[i] == '|') {
                        pistaArray[i] = '/' // If the atleta is running in a wall, the track is marked with '/'
                        success = false
                    }
                }
                "saltar" -> {
                    if (pistaArray[i] == '_') {
                        pistaArray[i] = 'x' // If the atleta is jumping instead of running, the track is marked with 'x'
                        success = false
                    }
                }
                else -> {
                    pistaArray[i] = '?' // If the atleta is not running or jumping, the track is marked with '?'
                    success = false
                }
            }
        }
    }

    // If atleta is smaller than pista, fill with '?'
    if (atleta.size < pistaArray.size) {
        //Gets the remaining elements of the pista array by getting the difference between the sizes
        for (i in atleta.size until pistaArray.size) {
            pistaArray[i] = '?'
            success = false
        }
    }

    val pistaModificada = pistaArray.concatToString()
    return Pair(success, pistaModificada)
}