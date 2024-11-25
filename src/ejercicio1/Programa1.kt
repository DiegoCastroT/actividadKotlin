package ejercicio1

fun main(){

    for(i in 1..100){
        //Revisar múltiplos de 3 y 5
        if(i % 3 == 0 && i % 5 == 0) {
            println("triqui")
        }else if(i % 3 == 0){
            println("tri")
        }else if(i % 5 == 0){
            println("qui")
        }else{
            println(i)
        }
    }
}