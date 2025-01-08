package UD4.actividade3.apartado3.personas;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa un profesor, cun nome, idade, despacho e email, e que pode falar
 */
public class Teacher extends Person implements Speaker {
    //Despacho do profesor
    private String office;
    //Email do profesor
    private String email;

    /**
     * Crea un novo profesor
     *
     * @param name nome do profesor
     * @param age idade do profesor
     * @param office oficina do profesor
     * @param email correo electronico do profesor
     */
    public Teacher(String name, int age, String office, String email) {
        super(name, age);
        this.office = office;
        this.email = email;
    }

    /**
     * Fai que o profesor fale
     */
    @Override
    public void speak() {
        System.out.println("Ola son un PROFESOR e sei falar");
        System.out.println("Nome: "+name+"\tIdade: "+age);
        System.out.println("Despacho: "+office+"\tEmail: "+email);
        System.out.println();
    }
}
