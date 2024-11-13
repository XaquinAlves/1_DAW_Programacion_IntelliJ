package UD3.actividade3a4;

/**
 * Esta e a clase Client, que representa a un cliente gardando NIF, nome e apelido
 *
 * @author Xaquin Alves Gonzalez
 */
public class Client {

    private String nif;
    private String name;
    private String surname;

    /**
     * Crea unha nova instancia de Client
     *
     * @param nif     NIF do cliente
     * @param name    nome do cliente
     * @param surname apelido do cliente
     */
    public Client(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    /**
     * @return NIF do cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * @param nif NIF do cliente a establecer
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * @return nome do cliente
     */
    public String getName() {
        return name;
    }

    /**
     * @param name nome do cliente a establecer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return apelido do cliente
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname apelido do cliente a establecer
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
