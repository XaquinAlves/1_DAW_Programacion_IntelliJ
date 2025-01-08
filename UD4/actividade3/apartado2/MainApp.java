package UD4.actividade3.apartado2;

import UD4.actividade3.apartado3.Speaker;
import UD4.actividade3.apartado3.aparatos.Radio;
import UD4.actividade3.apartado3.aparatos.TV;
import UD4.actividade3.apartado3.aves.Parrot;
import UD4.actividade3.apartado3.aves.Tweety;
import UD4.actividade3.apartado3.personas.Concierge;
import UD4.actividade3.apartado3.personas.Student;
import UD4.actividade3.apartado3.personas.Teacher;

/**
 * Nesta clase probamos as clases que implementan a interface Speaker
 */
public class MainApp {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Parrot loro =new Parrot('m',2,"Guyana","Rojo y blanco");
        Tweety piolin = new Tweety('m',50,"Gregoriano",175);
        Student alumno = new Student("Paco",22,2,"Ing. Informatica");
        Teacher profesor = new Teacher("Pepe",47,"12A","pepeteacher@teachers.es");
        Concierge bedel = new Concierge("Antonio",64,"mañana",40);
        TV tele = new TV(100,499.99,40,true);
        Radio radio = new Radio(25,14.99,false,49);

        Speaker[] speakers = {loro,piolin,alumno,profesor,bedel,tele,radio};

        for (Speaker speaker : speakers) {
            speaker.speak();
        }
    }
}
