package ejercicio6

class Agenda(private var contacts: ArrayList<Contacto>, private var maxSize: Int = 3) {

    //Adds a contact into contacts arrayList
    fun addContact(name: String, tel: String): Boolean {

        if (contacts.size >= maxSize) {
            println("La agenda esta llena")
            return false
        } else {
            for (contact in contacts) {
                if (checkName(name)) {
                    println("Ya existe ese nombre")
                    return false
                }
            }
            val contacto = Contacto(name, tel)
            contacts.add(contacto)
            return true
        }
    }

    //List all contacts
    fun listContacts() {
        if (contacts.size == 0) {
            println("No hay contactos")
        } else {
            for (contact in contacts) {
                println("Nombre: ${contact.nombre} Teléfono: ${contact.telefono}")
            }
        }
    }

    //Returns the contact
    fun getContact(name: String): String {
        if (checkName(name)) {
            val contact = contacts.find { it.nombre.uppercase() == name.uppercase() }
            return "Nombre: ${contact?.nombre} Teléfono: ${contact?.telefono}"
        } else {
            return "No encontrado"
        }
    }

    //Verify if the name exists
    fun isContact(name: String): Boolean {
        return checkName(name)
    }

    //Delete the contact if it exists
    fun deleteContact(name: String): Boolean {
        if (checkName(name)) {
            contacts.removeIf { it.nombre.uppercase() == name.uppercase() }
            return true
        }
        return false
    }

    //Returns the current size of the contacts
    fun getCurrentSize(): Int {
        return maxSize - contacts.size
    }

    //Returns if the agenda is full
    fun isFull(): Boolean {
        return contacts.size == maxSize
    }

    private fun checkName(name: String): Boolean {
        return contacts.find { it.nombre.uppercase() == name.uppercase() } != null
    }
}

