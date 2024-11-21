package UD3.actividade4apt4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta e a clase Statistics, que conten unha lista de numeros cuanha cantidade
 * impar e un metodo que amosa a mediana de dita lista
 *
 * @author Xaquin Alves Gonzalez
 */
public class Statistics {

    private int length;
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

    /**
     * Pide por teclado unha lista de enteiros cunha cantidade impar, pedindo tamen
     * a lonxitude do array por teclado
     *
     * @return array coa lista de enteiros
     */
    private ArrayList<Integer> getNumbers() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el número de elementos que introducirá(debe ser impar, 3 o mayor):  ");
        length = scan.nextInt();
        scan.nextLine();

        while (length % 2 == 0 && length < 3) {
            System.out.println("El número de elementos debe ser impar, 3 o mayor. Vuelva a introducirlo: ");
            length = scan.nextInt();
            scan.nextLine();
        }
        ArrayList<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            System.out.print("Introduce el número nº " + i + ": ");
            numbersList.add(scan.nextInt());
            scan.nextLine();
        }

        return numbersList;
    }

    /**
     * Ordena un ArrayList de Integers usando o algoritmo Quicksort
     * @param numbersList lista a ordenar
     * @return lista ordenada
     */
    public ArrayList<Integer> sort(ArrayList<Integer> numbersList){
        if(numbersList.size() <=1){
            return numbersList;
        }

        int pivot = numbersList.size()/2;
        int sameAsPivot = 0;

        ArrayList<Integer> lessers = new ArrayList<>();

        ArrayList<Integer> greaters = new ArrayList<>();

        for(int number: numbersList){
            if(number > numbersList.get(pivot)){
                greaters.add(number);
            }else if(number < numbersList.get(pivot)){
                lessers.add(number);
            }
            else{
                sameAsPivot++;
            }
        }

        lessers = sort(lessers);

        for (int i = 0; i < sameAsPivot ; i++) {
            lessers.add(numbersList.get(pivot));
        }

        greaters = sort(greaters);

        ArrayList<Integer> sorted = new ArrayList<>();
        sorted.addAll(lessers);
        sorted.addAll(greaters);

        return sorted;
    }

    /**
     * @return a mediana dos números gardados
     */
    public int median() {
        ArrayList<Integer> numbers = getNumbers();
        numbers = sort(numbers);

        return numbers.get((length/2));

    }
}
