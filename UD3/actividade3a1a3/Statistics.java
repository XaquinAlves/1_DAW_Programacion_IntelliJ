package UD3.actividade3a1a3;

import java.util.Scanner;

/**
 * Esta e a clase Statistics, que conten unha lista de numeros cuanha cantidade
 * impar e un metodo que amosa a mediana de dita lista
 *
 * @author Xaquin Alves Gonzalez
 */
public class Statistics {

    /**
     * Constructor que pide por teclado a cantidade de números e os números en
     * si
     */
    public Statistics() {
    }

    /**
     * Creamos unha instancia de Statistics para testeala
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Statistics stats = new Statistics();

        System.out.println("La mediana es : " + stats.median());
    }

    private int[] getNumbers() {
        Scanner scan = new Scanner(System.in);
        int length;

        System.out.println("Indique el número de elementos que introducirá(debe ser impar, 3 o mayor):  ");
        length = scan.nextInt();
        scan.nextLine();

        while (length % 2 == 0 && length < 3) {
            System.out.println("El número de elementos debe ser impar, 3 o mayor. Vuelva a introducirlo: ");
            length = scan.nextInt();
            scan.nextLine();
        }
        int[] numberList = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Introduce el número nº " + i + ": ");
            numberList[i] = scan.nextInt();
            scan.nextLine();
        }

        return numberList;
    }

    /**
     * @return a mediana dos números gardados
     */
    public int median() {
        int minors, greaters, median = 0;

        int[] numberList = getNumbers();

        for (int i : numberList) {

            minors = 0;
            greaters = 0;

            for (int j : numberList) {

                if (i < j) {
                    greaters++;
                } else if (i > j) {
                    minors++;
                } else {
                    minors++;
                    greaters++;
                }
            }

            if (minors == greaters) {
                median = i;
            }
        }
        return median;
    }
}
