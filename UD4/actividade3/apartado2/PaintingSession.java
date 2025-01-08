package UD4.actividade3.apartado2;

/**
 * Nesta clase probamos o funcionamento da clase Board e as distintas clases que extenden Shape
 *
 * @author Xaquin Alves Gonzalez
 */
public class PaintingSession {
    /**
     * Creamos unha instancia de Board, debuxamos varias figuras e borramos o encerado
     *
     * @param args
     */
    public static void main(String[] args) {
        Board board = new Board();

        Square square1 = new Square();
        Square square2 = new Square();

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 =  new Circle();

        board.drawShape(circle1);
        board.drawShape(circle2);
        board.drawShape(square1);

        board.drawShape(triangle1);
        board.drawShape(circle3);

        board.drawShape(triangle2);
        board.drawShape(square2);

        board.erraseBoard();
    }
}
