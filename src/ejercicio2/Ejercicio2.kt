package ejercicio2

fun main(){

    println("Introduce la primera palabra")
    val palabra1 = readln()
    val array1 = palabra1.toCharArray()
    println("Introduce la segunda palabra")
    val palabra2 = readln()
    val array2 = palabra2.toCharArray()


    if(array1.size == array2.size){
        array1.sort()

        array2.sort()
        if(array1.contentEquals(array2)){
            println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = " + true)
        }else{
            println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = " + false)
        }
    }else{
        println("¿Las palabras $palabra1 y $palabra2 son un anagrama? = " + false)
    }

}