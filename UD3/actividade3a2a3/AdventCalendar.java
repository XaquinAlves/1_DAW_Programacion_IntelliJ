package UD3.actividade3a2a3;

/**
 * @author Xaquin Alves Gonzalez
 */
public class AdventCalendar {
    private final int MAX_X = 6;
    private final int MAX_Y = 4;
    private final int MAX_VALUE =25;
    private int matrix[][];

    /**
     * Crea unha instancia de AdventCalendar
     */
    public AdventCalendar() {
        matrix = new int[MAX_X][MAX_Y];
    }

    /**
     * @return o array que garda os valores do calendario
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     *
     */
    public void show() {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fill() {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                do {
                    matrix[i][j] = new java.util.Random().nextInt(MAX_VALUE);
                }while (matrix[i][j] == 0);
            }
        }
    }

    public void eat() {

    }

    public boolean christmasIsHere() {

    }

}
