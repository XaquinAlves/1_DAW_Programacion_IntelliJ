package UD3.actividade8apt2;

import java.util.ArrayList;

    /**
     * Tester para a aplicación de distribución de alumnado nunha aula
     *
     * @author Profe de programación
     */
    public class Tester {

        /**
         * Comproba que unha distribución da aula é correcta
         *
         * @param classroom Array bidimensional co alumnado da aula distribuido
         * @param studentList Lista do alumnado que hai que repartir cos alumnos que
         * non queremos que teñan sentados ao lado
         * @return True se a distribución da aula é correcta, false en caso
         * contrario
         */
        private static boolean check(String[][] classroom, String[][] studentList) {
            // Recorremos o array da aula
            for (int i = 0; i < classroom.length; i++) {
                for (int j = 0; j < classroom[i].length; j++) {
                    // Buscamos o alumno actual na lista
                    boolean studentFound = false;
                    for (int z = 0; z < studentList.length && !studentFound; z++) {
                        if (studentList[z][0].equals(classroom[i][j])) {
                            // Creamos unha lista cos alumnos que ten sentados aos lados
                            ArrayList<String> studentsToCheck = new ArrayList<>();
                            if (j > 0) {
                                studentsToCheck.add(classroom[i][j - 1]);
                            }
                            if (j < classroom[i].length - 1) {
                                studentsToCheck.add(classroom[i][j + 1]);
                            }
                            // Comprobamos que ningún dos alumnos son incompatibles
                            for (String student : studentsToCheck) {
                                for (int t = 1; t < 3; t++) {
                                    if (student.equals(studentList[z][t])) {
                                        return false;
                                    }
                                }
                            }
                            studentFound = true;
                        }
                    }
                }
            }
            return true;
        }

        /**
         * Método principal para o comprobamento do funcionamento da aplicación
         *
         * @param args
         */
        public static void main(String args[]) {
            // Arrays cos dez casos de proba
            System.out.print("Xerando os casos de proba..........");
            String[][][] studentListArray = new String[][][]{
                    {
                            {"Daniel", "Juan", "Pablo"},
                            {"Juan", "Daniel", "Pablo"},
                            {"Lara", "Marcos", "Pablo"},
                            {"Marcos", "Abel", "Iago"},
                            {"Nacho", "Abel", "Daniel"},
                            {"Pablo", "Daniel", "Juan"},
                            {"Iago", "Nacho", null},
                            {"Abel", null, null}
                    },
                    {
                            {"Alberto", "Sonia", "Pedro"},
                            {"Juan", "Sonia", null},
                            {"Sonia", "Alberto", "Juan"},
                            {"Pedro", "Alberto", null}

                    },
                    {
                            {"Alberto", "Juan", "Pedro"},
                            {"Juan", "Alberto", "Pedro"},
                            {"Lara", "Iria", "Iago"},
                            {"Marcos", "Alex", "Juan"},
                            {"Sonia", "Alex", "Alberto"},
                            {"Pedro", "Alberto", "Juan"},
                            {"Iago", "Sonia", "Juan"},
                            {"Alex", "Sonia", "Juan"},
                            {"Iria", "Marcos", "Pedro"}
                    },
                    {
                            {"Daniel", "Juan", "Pablo"},
                            {"Juan", "Daniel", "Pablo"},
                            {"Lara", "Marcos", "Nacho"},
                            {"Marcos", "Abel", "Iago"},
                            {"Nacho", "Abel", "Daniel"},
                            {"Pablo", "Daniel", "Juan"},
                            {"Iago", "Nacho", null},
                            {"Abel", null, null}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"},
                            {"Sandra", "Ana", "Bilo"},
                            {"Bilo", "Hugo", "Andrea"},
                            {"Raul", null, "Brais"},
                            {"Ainhoa", null, null},
                            {"Alex", "Raul", "David"},
                            {"Ana", "Bilo", "David"}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"},
                            {"Sandra", "Ana", "Bilo"},
                            {"Bilo", "Hugo", "Andrea"},
                            {"Raul", null, "Brais"},
                            {"Ainhoa", null, null},
                            {"Alex", "Raul", "David"},
                            {"Ana", "Bilo", "David"}
                    },
                    {
                            {"David", "Maria", "Miguel"},
                            {"Maria", "Andrea", "Brais"},
                            {"Andrea", "Hugo", "Miguel"},
                            {"Brais", "David", null},
                            {"Hugo", "David", null},
                            {"Miguel", null, "Maria"},
                            {"Sandra", "Ana", "Bilo"},
                            {"Bilo", "Hugo", "Andrea"},
                            {"Raul", null, "Brais"},
                            {"Ainhoa", null, null},
                            {"Alex", "Raul", "David"},
                            {"Ana", "Bilo", "David"}
                    }
            };
            String[][][] classroomArray = new String[][][]{
                    new String[2][4],
                    new String[1][4],
                    new String[3][3],
                    new String[1][8],
                    new String[2][3],
                    new String[3][2],
                    new String[1][6],
                    new String[3][4],
                    new String[6][2],
                    new String[1][12]
            };
            System.out.println("[OK]");

            // Creamos o obxecto ClassroomManager
            ClassroomManager manager = new ClassroomManager();

            // Executamos os casos de proba e comprobamos o seu resultado
            for (int i = 0; i < studentListArray.length; i++) {
                System.out.print("Executando caso de proba " + i + ".........");
                manager.distributeStudents(classroomArray[i], studentListArray[i]);
                if (check(classroomArray[i], studentListArray[i])) {
                    System.out.println("[OK]");
                } else {
                    System.out.println("[FALLOU!]");
                }
                System.out.println("Resultado do caso de proba " + i + ":");
                manager.showClassroom(classroomArray[i]);
            }
        }
    }

