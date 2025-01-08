package UD4.actividade3.apartado3.personas;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa un alumno, cun nome, idade, carreira e curso, e que pode falar
 *
 * @author Xaquin Alves Gonzalez
 */
public class Student extends Person implements Speaker {
    //Carreira que estuda
    private String career;
    //Curso ao que pertence o alumno
    private int course;

    /**
     * Crea un novo alumno
     *
     * @param name nome do alumno
     * @param age idade do alumno
     * @param course curso ao que pertence o alumno
     * @param career carreira que estuda o alumno
     */
    public Student(String name, int age, int course, String career) {
        super(name, age);
        this.course = course;
        this.career = career;
    }

    /**
     * Fai que o alumno fale
     */
    @Override
    public void speak() {
        System.out.println("Ola, son un ALUMNO e sei falar");
    }
}
