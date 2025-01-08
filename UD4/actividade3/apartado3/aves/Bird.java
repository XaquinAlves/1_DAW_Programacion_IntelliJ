package UD4.actividade3.apartado3.aves;

/**
 * Esta clase representa un paxaro calquera, cun sexo e idade
 *
 * @author Xaquin Alves Gonzalez
 */
public abstract class Bird {
    //Sexo do paxaro
    protected char sex;
    //Idade do paxaro
    protected int age;

    /**
     * Crea un novo paxaro
     *
     * @param sex sexo do paxaro
     * @param age idade do paxaro
     */
    public Bird(char sex, int age) {
        this.sex = sex;
        this.age = age;
    }
}
