package ejercicio3

fun main() {
    println("Dame la expresion")

    val expresion = readln().toCharArray()
    if (check(expresion)) {

        println("La expresión es válida")
    } else {
        println("La expresión no es válida")
    }
}

fun check(expresion: CharArray): Boolean {

    val filteredElements = mutableListOf<Char>()
    val matchingElements = mapOf(')' to '(', ']' to '[', '}' to '{')

    for (char in expresion) {
        //Check the character is an opening char
        if (char in matchingElements.values) {
            filteredElements.add(char)
            
        } else if (char in matchingElements.keys) {
            try{
                //Check the character is a closing char and the last element in the list is the matching opening char
                if (filteredElements.removeAt(filteredElements.size - 1) != matchingElements[char]) {
                    return false
                }
            //Catch exception when there are more closing chars at the end
            }catch (IndexOutOfBoundsException: Exception){
                return false
            }
        }
    }
    return filteredElements.isEmpty()
}