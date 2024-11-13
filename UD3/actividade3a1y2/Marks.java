package UD3.actividade3a1y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Esta clase representa un conxunto de notas, que se almacenan como enteiros, e
 * conta cun metodo que calcula a media en double
 *
 * @author Xaquin Alves Gonzalez
 */
public class Marks {
    //ArrayList de Integer que garda as notas
    private ArrayList<Integer> marks;

    /**
     * Creamos unha instancia de Marks e invocamos os seus metodos para testear a
     * funcionalidade
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marks studentsMarks = new Marks();

        studentsMarks.setMarksKeyB();

        System.out.println("La nota media es: " + studentsMarks.getAverage());
    }

    /**
     * Crea un obxeto Marks con capacidade para 10 notas
     */
    public Marks() {
        marks = new ArrayList<>();
    }

    /**
     *
     * @return o ArrayList de Integer que garda as notas
     */
    public ArrayList<Integer> getMarks() {
        return marks;
    }

    /**
     *
     * @param marks ArrayList de Integer a establecer
     */
    public void setMarks(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    /**
     * Recolle por teclado as notas que se queiran gardar
     */
    private void setMarksKeyB() {
        Scanner scan = new Scanner(System.in);
        int max;

        System.out.println("Introduce a cantidade de notas que queres añadir: ");
        max = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < max; i++) {
            System.out.print("Introduce la nota nº " + i + ": ");
            marks.add(scan.nextInt());
            scan.nextLine();
        }
    }
    /**
     *
     * @return a media das notas gardadas
     */
    public double getAverage() {
        double avrg = 0;
        Iterator<Integer> it = marks.iterator();

        while (it.hasNext()){
            avrg += it.next();
        }
        avrg /= marks.size();

        return avrg;
    }
}

