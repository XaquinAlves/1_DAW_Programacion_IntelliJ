package UD3.actividade4apt1a2a3;

import java.util.Scanner;

/**
 * Esta clase reprensenta un array estatico (por defecto de 6 posicions)
 * de enteiros, cun metodo que ordena de maior a menor usando o algoritmo
 * bubble sort
 *
 * @author Xaquin Alves Gonzalez
 */
public class SortedArray {

    private final int MAX_NUMBERS = 6;
    private int[] ints;
    private boolean sorted;

    /**
     * Crea unha nova instancia con capacidade para MAX_NUMBERS elementos(6 por defecto),
     * pedindo ao usuario que introduza os valores por teclado
     */
    public SortedArray() {
        Scanner scanner = new Scanner(System.in);
        ints = new int[MAX_NUMBERS];
        System.out.println("Introduza os valores: ");

        for (int i = 0; i < MAX_NUMBERS; i++) {
            System.out.println("Valor " + i + ":");
            ints[i] = scanner.nextInt();
            scanner.nextLine();
        }

        sorted = false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedArray sortedArray = new SortedArray();

        sortedArray.show();

        System.out.println("Introduce un numero a buscar: ");
        int search = scanner.nextInt();
        scanner.nextLine();
        if (sortedArray.contains(search)) {
            System.out.println("O numero esta na lista");
        } else {
            System.out.println("O numero non esta na lista");
        }


    }

    /**
     * @return numero de elementos do array
     */
    public int getMAX_NUMBERS() {
        return MAX_NUMBERS;
    }

    /**
     * @return array de enteiros
     */
    public int[] getInts() {
        return ints;
    }

    /**
     * @param ints array de enteiros a establecer
     */
    public void setInts(int[] ints) {
        this.ints = ints;
    }

    /**
     * @return se o array esta ordenado
     */
    public boolean isSorted() {
        return sorted;
    }

    /**
     * Ordena de menor a maior utilizando o algoritmo bubble sort
     */
    public void sort() {
        for (int i = 1; i < MAX_NUMBERS; i++) {
            for (int j = 0; j < MAX_NUMBERS - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        sorted = true;
    }

    /**
     * Amosa o array por patalla
     */
    public void show() {
        System.out.println("Contido do array: ");
        for (Integer integer : ints) {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }

    /**
     * Comproba se o numero pasado como parametro se atopa dentro do array,
     * usando o algoritmo de busqueda dicotomica
     *
     * @param number
     * @return
     */
    public boolean contains(int number) {
        if (!sorted) {
            sort();
        }
        int min = 0;
        int max = MAX_NUMBERS - 1;
        int mid;

        if (number == ints[min] || number == ints[max]) {
            return true;
        } else {
            while (max - 1 != min && number > ints[min] && number < ints[max]) {
                mid = (min + max) / 2;

                if (ints[mid] == number) {
                    return true;
                } else if (number < ints[mid]) {
                    max = mid - 1;
                } else if (number > ints[mid]) {
                    min = mid + 1;
                }
            }
        }
        return false;
    }
}
