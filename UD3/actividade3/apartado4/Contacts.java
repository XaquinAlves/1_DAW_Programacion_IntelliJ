package UD3.actividade3.apartado4;

import java.util.HashMap;

/**
 * Esta é a clase Contacts, que garda unha lista de numeros de telefono asociados a un Client
 *
 * @author Xaquin Alves Gonzalez
 */
public class Contacts {

    private HashMap<Integer,Client> phonebook;

    /**
     * Crea unha nova instacia de Contacts
     */
    public Contacts() {
        this.phonebook = new HashMap<>();
    }

    /**
     *
     * @return HashMap que garda os clientes asociados aos seus numeros de telefono
     */
    public HashMap<Integer, Client> getPhonebook() {
        return phonebook;
    }

    /**
     *
     * @param phonebook HashMap que garda os clientes asociados aos seus numeros de telefono a establecer
     */
    public void setPhonebook(HashMap<Integer, Client> phonebook) {
        this.phonebook = phonebook;
    }

    /**
     * Añade un novo numero cun cliente asociado á axenda
     * @param tel telefono do cliente
     * @param cli Client que representa o cliente
     */
    public void insert(int tel, Client cli){
        phonebook.put(tel,cli);
    }

    /**
     *
     * @param tel telefono que se desexa eliminar da axenda
     */
    void remove(int tel){
        phonebook.remove(tel);
    }

    /**
     *
     * @param tel telefono que se desexa buscar
     * @return Client asocidado ao telefono dado, se non existe null
     */
    public Client findByNumber(int tel){
        return phonebook.get(tel);
    }

    /**
     *
     * @return numero de contactos gardados
     */
    public int numContacts(){
        return  phonebook.size();
    }

    public static void main(String[] args) {
        Contacts contacts = new Contacts();

        Client client1 = new Client("11111111A","Pepe","Pepez");
        Client client2 = new Client("22222222B", "Manolo", "Manolez");
        Client client3 = new Client("33333333C", "Benito", "Benitez");

        contacts.insert(986653295,client1);
        contacts.insert(677760713, client2);
        contacts.insert(666666666, client3);

        System.out.println("El numero 677760713 pertenece a: "+contacts.findByNumber(677760713).getName()+" "+contacts.findByNumber(677760713).getSurname());

        System.out.println("La agenda tiene "+contacts.numContacts()+" contactos" );

        contacts.remove(666666666);

        System.out.println("La agenda tiene "+contacts.numContacts()+" contactos" );
    }
}
