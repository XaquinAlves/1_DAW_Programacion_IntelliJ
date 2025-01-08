package UD4.actividade3.apartado2;

import java.awt.*;

/**
 * Esta clase representa unha figura calquera, que sera especificada mediante as clases que a extenden,
 * podendo esta debuxarse e borrarse
 *
 * @author Xaquin Alves González
 */
public abstract class Shape implements Coloreable{
    /**
     * Debuxa a figura
     */
    public abstract void draw();

    /**
     * Borra a figura
     */
    public abstract void errase();

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public void setColor(Color c) {

    }
}
