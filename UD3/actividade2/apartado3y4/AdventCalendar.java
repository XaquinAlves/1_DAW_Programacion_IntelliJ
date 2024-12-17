package UD3.actividade2.apartado3y4;

/**
 * @author Xaquin Alves Gonzalez
 */
public class AdventCalendar {
    private final int ROW = 6;
    private final int COLUMNS = 4;
    private final int MAX_VALUE = 25;
    private int[][] matrix;

    /**
     * Crea unha instancia de AdventCalendar
     */
    public AdventCalendar() {
        matrix = new int[ROW][COLUMNS];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        AdventCalendar calendar = new AdventCalendar();
        calendar.fill();
        System.out.println("Este es el calendario: ");
        calendar.show();

        while (!calendar.christmasIsHere()) {
            System.out.println("Voy a comer uno");
            calendar.eat();
            calendar.show();
        }
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
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Enche a matriz con valores aleatorios de 1 a 24
     */
    public void fill() {
        int x, y;

        for (int i = 1; i < MAX_VALUE; i++) {
            do {
                x = new java.util.Random().nextInt(ROW);
                y = new java.util.Random().nextInt(COLUMNS);
            } while (matrix[x][y] != 0);
            matrix[x][y] = i;
        }
    }

    /**
     * Come un elemento (o de menor numero)
     */
    public void eat() {
        int minor = Integer.MAX_VALUE, x = 0, y = 0;

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMNS; j++) {
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

        for (int i = 0; i < ROW && isChristmas; i++) {
            for (int j = 0; j < COLUMNS && isChristmas; j++) {
                if (matrix[i][j] != 0) {
                    isChristmas = false;
                }
            }
        }
        if(isChristmas){
            System.out.println("Feliz Navidad!");
        }
        return isChristmas;
    }
}
