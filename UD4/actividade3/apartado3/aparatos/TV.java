package UD4.actividade3.apartado3.aparatos;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa unha television, cun consumo, prezo, pulgadas e un booleano que indica
 * se ten teletexto, e que pode falar
 *
 * @author Xaquin Alves Gonzalez
 */
public class TV extends Device implements Speaker {
    //Pulgadas da televison
    private int inches;
    //Se a television ten teletexto
    private boolean teletext;

    /**
     * Crea unha nova television
     *
     * @param consumption consumo da television
     * @param price prezo da television
     * @param inches pulgadas da television
     * @param teletext se a television ten teletexto
     */
    public TV(int consumption, double price, int inches, boolean teletext) {
        super(consumption, price);
        this.inches = inches;
        this.teletext = teletext;
    }

    /**
     * Fai que a television fale
     */
    @Override
    public void speak() {
        System.out.println("Ola son unha TELEVISION e sei falar");
        System.out.println("Consumo: "+consumption+"\tPrecio: "+price);
        if (this.teletext){System.out.print("Teletexto: Si\t");}
        else{System.out.print("Teletexto: No\t");}
        System.out.println("Pulgadas: "+inches);
    }
}
