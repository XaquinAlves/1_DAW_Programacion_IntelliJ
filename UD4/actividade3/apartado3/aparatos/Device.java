package UD4.actividade3.apartado3.aparatos;

/**
 * Esta clase representa un aparato electronico calquera, cun consumo e un prezo
 */
public abstract class Device {
    //Consumo do aparato
    protected int consumption;
    //Prezo do aparato
    protected double price;

    /**
     * Crea un novo aparato electronico
     *
     * @param consumption consumo do aparato
     * @param price prezo do aparato
     */
    public Device(int consumption, double price) {
        this.consumption = consumption;
        this.price = price;
    }
}
