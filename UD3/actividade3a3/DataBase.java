package UD3.actividade3a3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta e a clase DataBase, que representa unha base de datos de clientes,
 * implementado cun ArrayList da clase Client
 *
 * @author Xaquin Alves Gonzalez
 */
public class DataBase {

    private ArrayList<Client> clients;

    /**
     * Crea unha nova instancia de DataBase
     */
    public DataBase() {
        this.clients = new ArrayList<>();
    }

    /**
     * @return ArrayList de clientes (Client)
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    /**
     * @param clients ArrayList de clientes (Client)
     */
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    /**
     * Pide por teclado os datos dun cliente e agregao a base de datos
     */
    public void addClient() {
        Scanner scanner = new Scanner(System.in);
        String nif, name, surname;

        System.out.print("Introduce o nif do cliente a rexistrar: ");
        nif = scanner.nextLine();

        System.out.print("Introduce o nome do cliente a rexistrar: ");
        name = scanner.nextLine();

        System.out.print("Introduce o apelido do cliente a rexistrar: ");
        surname = scanner.nextLine();

        System.out.println();

        Client client = new Client(nif, name, surname);
        clients.add(client);
    }

    /**
     * Mostra por pantalla os nif dos clientes gardados
     */
    public void showClients() {
        System.out.println("LISTA DE CLIENTES");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println("Cliente " + i + " NIF: " + clients.get(i).getNif());
        }
        System.out.println();
    }

    /**
     * Elimina o cliente que ten o nif que se introduce como parametro, no caso de que exista
     * @param nif do cliente a eliminar
     */
    public void removeClient(String nif){
        for (int i = 0; i < clients.size() ; i++) {
            if (clients.get(i).getNif().equals(nif)){
                clients.remove(i);
            }
        }
    }

    /**
     *
     * @return numero de clientes rexistrados na base de datos
     */
    public int numClients(){
        return clients.size();
    }

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        String nifEliminate;
        Scanner scanner = new Scanner(System.in);

        dataBase.addClient();
        dataBase.addClient();
        dataBase.addClient();

        dataBase.showClients();
        System.out.println("A base de datos ten "+dataBase.numClients()+" clientes.");

        System.out.print("Introduce el nif de un cliente a eliminar: ");
        nifEliminate = scanner.nextLine();
        dataBase.removeClient(nifEliminate);

        dataBase.showClients();
        System.out.println("A base de datos ten "+dataBase.numClients()+" clientes.");
    }
}
