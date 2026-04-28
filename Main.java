//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Création du gestionnaire
        //objet : la classe + l'objet + le constructeur 
        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact contact1 = new Contact();
        contact1.name = "Kouakou";
        contact1.phoneNumber = "+225 07 11 22 33";
        myContactsManager.addContact(contact1);

        // Contact 2
        Contact contact2 = new Contact();
        contact2.name = "Aminata";
        contact2.phoneNumber = "+225 05 44 55 66";
        myContactsManager.addContact(contact2);

        // Contact 3
        Contact contact3 = new Contact();
        contact3.name = "Ibrahim";
        contact3.phoneNumber = "+225 01 77 88 99";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name = "Fatou";
        contact4.phoneNumber = "+225 07 22 33 44";
        myContactsManager.addContact(contact4);

        // Contact 5
        Contact contact5 = new Contact();
        contact5.name = "Yao";
        contact5.phoneNumber = "+225 05 55 66 77";
        myContactsManager.addContact(contact5);

        // Rechercher un contact
        Contact found = myContactsManager.searchContact("Yao");
        if (found != null) {
            System.out.println("Le Numéro de " + found.name + " est : " + found.phoneNumber);
        } else {
            System.out.println("Contact introuvable.");
        }
    }
}