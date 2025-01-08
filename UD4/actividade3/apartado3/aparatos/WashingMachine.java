package UD4.actividade3.apartado3.aparatos;

/**
 * Esta clase representa unha lavadora, cun consumo, precio, altura e anchura
 */
public class WashingMachine extends Device{
    //Altura da lavadora
    private double height;
    //Ancho da lavadora
    private double width;

    /**
     * Crea unha nova lavadora
     *
     * @param consumption consumo da lavadora
     * @param price precio da lavadora
     * @param height altura da lavadora
     * @param width ancho da lavadura
     */
    public WashingMachine(int consumption, double price, double height, double width) {
        super(consumption, price);
        this.height = height;
        this.width = width;
    }
}
