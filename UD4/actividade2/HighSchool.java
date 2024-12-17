package UD4.actividade2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HighSchool {
    //Nome do instituto
    private String name;
    //Profesores do instituto
    private ArrayList<Teacher> teachers;

    /**
     * Crea un novo instituto
     *
     * @param name nome do instituto
     */
    public HighSchool(String name) {
        this.name = name;
        teachers = new ArrayList<>();
    }

    /**
     *
     * @return nome deste instituto
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name nome do instituto a establecer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return lista de profesores
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param teachers lista de profesores a establecer
     */
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     *
     * @return profesor con mais salario
     */
    public Teacher mostPaid(){
        Teacher teacher = teachers.getFirst();

        for (int i=1; i < teachers.size();i++){
            if(teachers.get(i).salary > teacher.getSalary()){
                teacher = teachers.get(i);
            }
        }

        return teacher;
    }

    /**
     *
     * @return profesor con menos salario
     */
    public Teacher leastPaid(){
        Teacher teacher = teachers.getFirst();

        for (int i=1; i < teachers.size();i++){
            if(teachers.get(i).salary < teacher.getSalary()){
                teacher = teachers.get(i);
            }
        }

        return teacher;
    }

    /**
     *
     * @return suma dos salarios de todos os profesores
     */
    public double salaryCosts(){
        double salaries = 0;

        for(Teacher teacher:teachers){
            salaries += teacher.salary;
        }

        return salaries;
    }

    /**
     *
     * @return media dos salarios dos profesores
     */
    public double salaryAverage(){
        double salaries = salaryCosts();

        return salaries / teachers.size();
    }

    public static void main(String[] args) {
        HighSchool instituto = new HighSchool("IES Pazo da Merce");

        CarrerOfficer funcionario = new CarrerOfficer("Benito", "Benitez", "Rua A n12", 1500.20,
                755.75, 2007, "A coruña");

        Interim interino = new Interim("Gonzalo", "Gonzalez", "Rua B n45", 1200.50,
                300.75, "Monteporreiro");

        Substitute substituto = new Substitute("Fernando", "Fernandez", "Rua A n65", 1325.33,
                275.66, new Date(2024, Calendar.OCTOBER, 24));

        funcionario.generatePayroll();
        instituto.getTeachers().add(funcionario);

        interino.generatePayroll();
        instituto.getTeachers().add(interino);

        substituto.generatePayroll();
        instituto.getTeachers().add(substituto);

        System.out.println("O profesor que mais cobra é "+instituto.mostPaid().getName());
        System.out.println("O profesor que menos cobra é "+instituto.leastPaid().getName());
        System.out.println("O gasto en soldos é: "+instituto.salaryCosts());
        System.out.println("A media dos soldos é: "+instituto.salaryAverage());

    }
}
