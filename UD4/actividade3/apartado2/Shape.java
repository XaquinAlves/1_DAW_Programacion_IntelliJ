package UD4.actividade3.apartado2;

import java.awt.Color;

/**
 * Esta clase representa unha figura calquera, que sera especificada mediante as clases que a extenden,
 * podendo esta debuxarse e borrarse
 *
 * @author Xaquin Alves González
 */
public abstract class Shape implements Coloreable {
    //Color da forma
    Color color;

    /**
     * Debuxa a figura
     */
    public abstract void draw();

    /**
     * Borra a figura
     */
    public abstract void errase();

    /**
     * Obten o color da forma
     *
     * @return color da forma
     */
    @Override
    public Color getColor() {
        return color;
    }

    /**
     * Establece a cor da forma
     *
     * @param c cor a establecer
     */
    @Override
    public void setColor(Color c) {
        color = c;
    }
}
