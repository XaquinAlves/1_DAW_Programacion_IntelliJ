package UD3.actividade8apt2;

public class ClassroomManager {
    //Cantidade de alumnos

    //Lista de alumnos coas suas restriccions
    private String[][] studentsList;
    //Distribucion da clase
    private String[][] classroom;

    /**
     * Ordena a clase para que se cumplan as restriccions por forza bruta
     *
     * @param classroom clase na que se sentaran os alumnos
     * @param studentsList lista de alumnos coas suas restriccions
     */
    public void distributeStudents(String[][] classroom, String[][] studentsList) {
        boolean sorted;

        do{
            for (int i = 0; i < classroom.length; i++) {
                for (int j = 0; j < classroom[i].length; j++) {
                    classroom[i][j] = null;
                }
            }

            for (int i = 0; i < studentsList.length; i++) {
                int row, column;

                do {
                    row = new java.util.Random().nextInt(classroom.length);
                    column = new java.util.Random().nextInt(classroom[row].length);
                } while (!(classroom[row][column] == null));

                classroom[row][column] = studentsList[i][0];
            }

            sorted = true;

            for (int i = 0; i < classroom.length; i++) {
                for (int j = 0; j < classroom[i].length; j++) {
                    for (String[] studend : studentsList) {
                        if (classroom[i][j].equals(studend[0])) {
                            if (j > 0) {
                                if (classroom[i][j - 1].equals(studend[1]) || classroom[i][j - 1].equals(studend[2])) {
                                    sorted = false;
                                }
                            }
                            if (j < classroom[i].length - 1) {
                                if (classroom[i][j + 1].equals(studend[1]) || classroom[i][j + 1].equals(studend[2])) {
                                    sorted = false;
                                }
                            }
                        }
                    }
                }
            }
        }while (!sorted);
    }

    /**
     * Amosa por pantalla unha clase cos estudantes sentados
     *
     * @param classroom clase a mostrar
     */
    public void showClassroom(String[][] classroom) {
        for (int i = 0; i < classroom.length; i++) {
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + " ");
            }
            System.out.println();
        }
    }

}
