package UD4.actividade3.apartado3.aves;

/**
 * Esta clase representa un buitre, cun sexo, idade, velocidade de voo e peso
 *
 * @author Xaquin Alves Gonzalez
 */
public class Vulture extends Bird{
    //Velocidade de voo do buitre
    private double flightSpeed;
    //Peso do buitre
    private double Weight;

    /**
     * Crea un novo buitre
     *
     * @param sex sexo do buitre
     * @param age idade do buitre
     * @param flightSpeed velocidade de voo do buitre
     * @param weight peso do buitre
     */
    public Vulture(char sex, int age, double flightSpeed, double weight) {
        super(sex, age);
        this.flightSpeed = flightSpeed;
        Weight = weight;
    }
}
