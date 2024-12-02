package ejercicio6

fun main() {

    println("Bienvenido, esta es tu agenda de contactos.")
    println("Escoge una opción")
    var success = false

    while (!success) {
        var input = readln().toInt()

        when (input) {
            1 -> addContact()
            2 -> listAllContacts()
            3 -> searchContact()
            4 -> checkIfExists()
            5 -> deleteContact()
            6 -> getStorage()
            7 -> checkFull()
            8 -> exit()


        }
    }


}

fun showMenu() {
    println("1. Añadir un contacto a la agenda")
    println("2. Listar todos los contactos de la agenda.")
    println("3. Buscar un contacto por su nombre.")
    println("4. Comprobar si un contacto existe.")
    println("5. Eliminar un contacto")
    println("6. Indicar el número de contactos que se pueden añadir en la agenda, es decir, indicar el número de huecos libres.")
    println("7. Comprobar si la agenda está llena.")
    println("8. Salir")


}


fun addContact() {

}

fun listAllContacts() {

}

fun searchContact() {

}

fun deleteContact() {

}

fun checkIfExists() {

}

fun getStorage() {

}

fun checkFull() {

}

fun exit() {

}