package UD4.actividade3.apartado1;

/**
 * Esta clase representa a figura cadrado
 *
 * @author Xaquin Alves Gonzalez
 */
public class Square extends  Shape{
    /**
     * Crea un novo cadrado
     */
    public Square() {
    }

    /**
     * Debuxa o cadrado
     */
    @Override
    public void draw() {
        System.out.println("Debuxando cadrado");
    }

    /**
     * Borra o cadrado
     */
    @Override
    public void errase() {
        System.out.println("Borrando cadrado");
    }
}
