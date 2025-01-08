package UD4.actividade3.apartado3.aves;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa a Piolin, que ten un sexo, idade, canto e numero de peliculas, e que pode falar
 */
public class Tweety extends Canary implements Speaker {
    //Numero de peliculas de piolin
    private int numberOfFilms;

    /**
     * Crea un novo Piolin
     *
     * @param sex sexo do Piolin
     * @param age idade do Piolin
     * @param sing canto do Piolin
     * @param numberOfFilms numero de peliculas do piolin
     */
    public Tweety(char sex, int age, String sing, int numberOfFilms) {
        super(sex, age, sing);
        this.numberOfFilms = numberOfFilms;
    }

    /**
     * Fai que o piolin fale
     */
    @Override
    public void speak() {
        System.out.println("Ola son Piolin e sei falar");
        if(sex == 'm'){
            System.out.print("Sexo: Macho\t");
        }else{System.out.print("Sexo: Femia\t");}
        System.out.println("Idade: "+age);

        System.out.println("Canto: "+sing+"\tNumero de peliculas: "+numberOfFilms);
        System.out.println();
    }
}
