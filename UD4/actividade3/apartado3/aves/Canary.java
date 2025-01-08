package UD4.actividade3.apartado3.aves;

/**
 * Esta clase representa un canario, cun sexo, idade e canto
 *
 * @author Xaquin Alves Gonzalez
 */
public class Canary extends Bird{
    //Canto do canario
    private String sing;

    /**
     * Crea un novo canario
     *
     * @param sex sexo do canario
     * @param age idade do canario
     * @param sing canto do canario
     */
    public Canary(char sex, int age, String sing) {
        super(sex, age);
        this.sing = sing;
    }
}
