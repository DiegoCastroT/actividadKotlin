package ejercicio5

fun main() {

    val winnerOptions = listOf(
        listOf(0, 1, 2),
        listOf(3, 4, 5),
        listOf(6, 7, 8),
        listOf(0, 3, 6),
        listOf(1, 4, 7),
        listOf(2, 5, 8),
        listOf(0, 4, 8),
        listOf(2, 4, 6)
    )

    val matriz = Array(3) { Array(3) { "" } }
    matriz[0] = arrayOf("X", "X", "X")
    matriz[1] = arrayOf("O", "O", "O")
    matriz[2] = arrayOf("X", "O", "X")

    println(check(matriz, winnerOptions))
}

fun check(matriz: Array<Array<String>>, winnerOptions: List<List<Int>>): String {
    //Unifying the matriz in a single list
    val unifiedMatriz = matriz.flatten()

    var xCount = 0
    var oCount = 0
    var emptyCount = 0

    //Will count the number of X, O and empty spaces in the matriz to manage the game state
    for (element in unifiedMatriz) {
        when (element) {
            "X" -> xCount++
            "O" -> oCount++
            "" -> emptyCount++
        }
    }

    //Check if the game is ilegal
    if (xCount > oCount + 1 || oCount > xCount + 1 || xCount + oCount + emptyCount != 9) {
        return "Null"
    }

    val winner = findWinner(unifiedMatriz, winnerOptions)


    return when (winner) {
        null -> "Null"
        "X" -> "X"
        "O" -> "O"
        else -> "Empate"
    }
}

fun findWinner(flatMatriz: List<String>, winnerOptions: List<List<Int>>): String? {
    var xWins = false
    var oWins = false

    for (option in winnerOptions) {
        val a = option[0]
        val b = option[1]
        val c = option[2]

        if (flatMatriz[a].isNotEmpty() && flatMatriz[a] == flatMatriz[b] && flatMatriz[a] == flatMatriz[c]) {
            if (flatMatriz[a] == "X") {
                xWins = true
            } else if (flatMatriz[a] == "O") {
                oWins = true
            }
        }
    }

    return when {
        xWins && oWins -> null
        xWins -> "X"
        oWins -> "O"
        else -> "Empate"
    }
}