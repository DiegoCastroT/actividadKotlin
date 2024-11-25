package ejercicio2

/**
 * This program checks if two words are anagrams
 * @param array1 first word
 * @param array2 second word
 */
fun main(){

    println("Introduce la primera palabra")
    val gettedWord1 = readln()
    val word1 = gettedWord1.toCharArray()
    println("Introduce la segunda palabra")
    val palabra2 = readln()
    val gettedWord2 = palabra2.toCharArray()


    println("¿Las palabras $gettedWord1? y $palabra2 son un anagrama = "
               + checkAnagrama(word1,gettedWord2) )

}

private fun checkAnagrama(
    array1: CharArray,
    array2: CharArray,
): Boolean {

    return if (array1.size == array2.size) {
        //Sort the arrays and compare them to see if they are the same
        array1.sort()
        array2.sort()
        array1.contentEquals(array2)
    } else {
        false
    }
}