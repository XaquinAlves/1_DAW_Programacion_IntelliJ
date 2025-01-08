package UD4.actividade3.apartado1;

/**
 * Esta clase representa a figura circulo
 *
 * @author Xaquin Alves Gonzalez
 */
public class Circle extends Shape{
    /**
     * Crea un novo circulo
     */
    public Circle() {
    }

    /**
     * Debuxa o circulo
     */
    @Override
    public void draw() {
        System.out.println("Debuxando circulo");
    }

    /**
     * Borra o circulo
     */
    @Override
    public void errase() {
        System.out.println("Borrando circulo");
    }
}
