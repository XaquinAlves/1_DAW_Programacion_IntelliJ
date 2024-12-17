package UD4.actividade1.apartado1;

import java.util.Scanner;

/**
 * Esta clase representa unha matriz de 3x3, cun metodo que suma duas matrices
 *
 * @author Xaquin Alves Gonzalez
 */
public class Matrix {
    //Garda os numeros da matriz
    private int[][] matrix;

    /**
     * Crea unha instacia de Matrix pedindo os numeros ao usuario
     */
    public Matrix() {
        matrix = new int[3][3];
        this.setNumbersKeyB();
    }

    /**
     * Crea unha instancia de Matrix, dependendo do valor de default values,
     * se é true pon en cada posicion a suma da fila e a columna, se é false deixa
     * sen inicializar o array
     *
     * @param defaultValues true inicializa o array cos valores por defecto, false non inicializa
     */
    public Matrix(boolean defaultValues) {
        if (defaultValues) {
            matrix = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = i + j;
                }
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    /**
     * @return array que almacena os valores da matriz
     */
    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Establece os numéros desta matriz pedindoos por teclado
     */
    public void setNumbersKeyB() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Introduce el número de la posición " + i + "," + j + ": ");
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }
    }

    /**
     * Mostra esta matriz por pantalla
     */
    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Suma esta matriz coa dada como parámetro
     *
     * @param matrix2 matriz a sumar
     * @return matriz resultante da suma
     */
    public Matrix sum(Matrix matrix2) {
        Matrix result = new Matrix();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.getMatrix()[i][j] = matrix[i][j] + matrix2.getMatrix()[i][j];
            }
        }

        return result;
    }

    /**
     * Resta a matriz dada como parametro a esta matriz
     *
     * @param matrix2 matriz que se restará
     * @return matriz resultado da resta
     */
    public Matrix substract(Matrix matrix2) {
        Matrix result = new Matrix();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.getMatrix()[i][j] = matrix[i][j] - matrix2.getMatrix()[i][j];
            }
        }

        return result;
    }


}
