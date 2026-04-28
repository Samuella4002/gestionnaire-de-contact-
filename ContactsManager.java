public class ContactsManager {

    Contact[] contacts = new Contact[10];
    int nombre = 0;
     // pour ajouter un contact
    public void addContact(Contact contact) {
        contacts[nombre] = contact;
        nombre++;
    }
    //pour rechercher
    public Contact searchContact(String name) {
        for (int i = 0; i < nombre; i++) {
            if (contacts[i].name.equals(name)) {
                return contacts[i];
            }
        }
        return null;
    }
}