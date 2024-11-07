package UD3.actividade3a2a3;

/**
 * @author Xaquin Alves Gonzalez
 */
public class AdventCalendar {
    private final int MAX_X = 6;
    private final int MAX_Y = 4;
    private final int MAX_VALUE = 25;
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
     * Mostra o calendario de advento por pantalla
     */
    public void show() {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Enche a matriz con valores aleatorios de 1 a 24
     */
    public void fill() {
        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                do {
                    matrix[i][j] = new java.util.Random().nextInt(MAX_VALUE);
                } while (matrix[i][j] == 0);
            }
        }
    }

    /**
     * Come un elemento (o de menor numero)
     */
    public void eat() {
        int minor = Integer.MAX_VALUE, x = 0, y = 0;

        for (int i = 0; i < MAX_X; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                if (matrix[i][j] < minor && matrix[i][j] != 0) {
                    minor = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        matrix[x][y] = 0;
    }

    /**
     * Comproba se e Navidade vendo se todos os elementos valen 0
     *
     * @return se é Navidade
     */
    public boolean christmasIsHere() {
        boolean isChristmas = true;

        for (int i = 0; i < MAX_X && isChristmas; i++) {
            for (int j = 0; j < MAX_Y && isChristmas; j++) {
                if (matrix[i][j] != 0) {
                    isChristmas = false;
                }
            }
        }

        return isChristmas;
    }

    public static void main(String[] args) {
        AdventCalendar calendar = new AdventCalendar();
        calendar.fill();
        System.out.println("Este es el calendario: ");
        calendar.show();

        while (!calendar.christmasIsHere()){
            System.out.println("Voy a comer uno");
            calendar.eat();
            calendar.show();
        }
    }
}
