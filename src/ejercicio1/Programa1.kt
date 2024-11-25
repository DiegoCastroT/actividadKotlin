package ejercicio1

/**
 * This program prints numbers from 1 to 100, but for multiples of three print "tri"
 * instead of the number and for the multiples of five print "qui".
 * For numbers which are multiples of both three and five print "triqui".
 */
fun main(){

    for(i in 1..100){
        //Check if numbers are divisible by 3 and 5
        if(i % 3 == 0 && i % 5 == 0) {
            println("triqui")
        //Check if numbers are divisible by 3
        }else if(i % 3 == 0){
            println("tri")
        //Check if numbers are divisible by 5
        }else if(i % 5 == 0){
            println("qui")
        }else{
            println(i)
        }
    }
}