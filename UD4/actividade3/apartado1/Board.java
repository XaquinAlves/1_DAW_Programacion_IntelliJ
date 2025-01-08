package UD4.actividade3.apartado1;

import java.util.ArrayList;

/**
 * Esta clase representa un encerado, que pode conter distintas figuras, cun metodo para
 * engadilas(debuxalas) e outro para borrar todas as figuras
 */
public class Board {
    //Conten as formas debuxadas no encerado
    private ArrayList<Shape> shapes;

    /**
     * Crea un novo encerado
     */
    public Board() {
        shapes = new ArrayList<>();
    }

    /**
     * @return lista de figuras debuxadas no encerado
     */
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    /**
     * @param shapes lista de figuras a establecer
     */
    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Debuxa unha figura no encerado
     *
     * @param shape figura a debuxar
     */
    public void drawShape(Shape shape) {
        //Debuxa a figura
        shape.draw();
        //Engadea a lista
        shapes.add(shape);
    }

    /**
     * Borra o encerado completo
     */
    public void erraseBoard(){
        //Borra todas as figuras
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).errase();
        }
        //Vacia a lista
        shapes.clear();
    }
}
