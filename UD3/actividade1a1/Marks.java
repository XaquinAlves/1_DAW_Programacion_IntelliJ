package UD3.actividade1a1;
import java.util.Scanner;
/**
 * Esta clase representa un conxunto de notas, que se almacenan como enteiros, e
 * conta cun metodo que calcula a media en double
 *
 * @author Xaquin Alves Gonzalez
 */
public class Marks {
    private int[] marks;

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
        marks = new int[10];
    }

    /**
     * Recolle por teclado as notas que se queiran gardar
     */
    private void setMarksKeyB() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Introduce la nota nº " + i + ": ");
            marks[i] = scan.nextInt();
            scan.nextLine();
        }
    }
    /**
     *
     * @return a media das notas gardadas
     */
    public double getAverage() {
        double avrg = 0;

        for (int mark : marks) {
            avrg += mark;
        }

        avrg /= marks.length;

        return avrg;
    }
}

