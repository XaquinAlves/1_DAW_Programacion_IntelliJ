package UD4.actividade3.apartado3.aparatos;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa unha radio, cun consumo, precio, potencia e un booleano que indica se ten
 * cassete, e que pode falar
 *
 * @author Xaquin Alves Gonzalez
 */
public class Radio extends Device implements Speaker {
    //Se ten cassette
    private boolean cassette;
    //Potencia da radio
    private int power;

    /**
     * Crea unha nova radio
     *
     * @param consumption consumo da radio
     * @param price prezo da radio
     * @param cassette se a radio ten cassette
     * @param power potencia da radio
     */
    public Radio(int consumption, double price, boolean cassette, int power) {
        super(consumption, price);
        this.cassette = cassette;
        this.power = power;
    }

    /**
     * Fai que a radio fale
     */
    @Override
    public void speak() {
        System.out.println("Ola, son unha RADIO e sei falar");
        System.out.println("Consumo: "+consumption+"\tPrecio: "+price);
        if (this.cassette){
            System.out.print("Cassette: Si\t");
        } else{System.out.print("Cassette: No\t");}
        System.out.println("Potencia: "+power);
    }
}
