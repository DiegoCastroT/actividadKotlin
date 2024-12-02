package ejercicio6

//Nombre unique
class Agenda(private var contacts: ArrayList<Contacto>, private var maxSize: Int = 3) {

    fun addContact(name: String, tel: String): Boolean {

        if (contacts.size >= maxSize) {
            return false
        } else {
            for (contact in contacts) {
                if (contact.nombre == name) {
                    return false
                }
            }
            val contacto = Contacto(name, tel)
            contacts.add(contacto)
            return true
        }
    }

    fun listContacts() {
        for (contact in contacts) {
            println("Nombre: ${contact.nombre} Teléfono: ${contact.telefono}")
        }
    }

    fun getContact(name: String): String {
        for (contact in contacts) {
            if (contact.nombre == name) {
                return ("su telefono es: ${contact.telefono}")
            }
        }
        return "No encontrado"
    }

    fun isContact(name: String): Boolean {

        for (contact in contacts) {
            if (contact.nombre == name) {
                return true
            }
        }
        return false
    }

    fun deleteContact(name: String): Boolean {
        for (contacto in contacts) {
            if (contacto.nombre == name) {
                contacts.remove(contacto)
                return true
            }
        }
        return false
    }

    fun getCurrentSize(): Int {
        return maxSize - contacts.size
    }

    fun isFull(): Boolean {
        return contacts.size == maxSize
    }
}

