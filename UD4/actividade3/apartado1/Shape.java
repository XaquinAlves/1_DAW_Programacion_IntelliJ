package UD4.actividade3.apartado1;

import UD4.actividade3.apartado2.Coloreable;

import java.awt.Color;

/**
 * Esta clase representa unha figura calquera, que sera especificada mediante as clases que a extenden,
 * podendo esta debuxarse e borrarse
 *
 * @author Xaquin Alves González
 */
public abstract class Shape{
    Color color;
    /**
     * Debuxa a figura
     */
    public abstract void draw();

    /**
     * Borra a figura
     */
    public abstract void errase();
}
