package UD4.actividade3.apartado3.personas;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa un Bedel cun nome, idade, turno e antiguedade, e que pode falar
 */
public class Concierge extends Person implements Speaker {
    //Turno do bedel
    private String turn;
    //Antiguedade do bedel
    private int seniority;

    /**
     * Crea un novo bedel
     *
     * @param name nome do bedel
     * @param age idade do bedel
     * @param turn turno do bedel
     * @param seniority antiguedade do bedel
     */
    public Concierge(String name, int age, String turn, int seniority) {
        super(name, age);
        this.turn = turn;
        this.seniority = seniority;
    }

    /**
     * Fai que o bedel fale
     */
    @Override
    public void speak() {
        System.out.println("Ola son un BEDEL e sei falar");
        System.out.println("Nome: "+name+"\tIdade: "+age);
        System.out.println("Turno: "+turn+"\tAntigüedade: "+seniority);
        System.out.println();
    }
}
