package UD4.actividade3.apartado2;

/**
 * Esta clase representa a figura triangulo
 *
 * @author Xaquin Alves Gonzalez
 */
public class Triangle extends Shape {
    /**
     * Crea un novo triangulo
     */
    public Triangle() {
    }

    /**
     * Debuxa o triangulo
     */
    @Override
    public void draw() {
        System.out.println("Debuxando triangulo");
    }

    /**
     * Borra o triangulo
     */
    @Override
    public void errase() {
        System.out.println("Borrando triangulo");
    }
}
