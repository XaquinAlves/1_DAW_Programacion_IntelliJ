package UD4.actividade3.apartado3.personas;

/**
 * Esta clase reprensenta a unha persoa calquera, cun nome e idade
 *
 * @author Xaquin Alves Gonzalez
 */
public abstract class Person {
    //Nome da persoa
    protected String name;
    //Idade da persoa
    protected int age;

    /**
     * Crea unha instancia de persoa
     *
     * @param name nome da persoa
     * @param age idade da persoa
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
