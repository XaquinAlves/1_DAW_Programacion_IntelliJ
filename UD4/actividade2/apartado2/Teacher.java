package UD4.actividade2.apartado2;

import java.util.Calendar;
import java.util.Date;

/**
 * Esta clase representa un profesor de forma abstracta, que se implementa en tres
 * distintas subclases: CareerOfficer(funcionario de carreira), Interim(interino) e
 * Substitute(substituto)
 *
 * @author Xaquin Alves Gonzalez
 */
public abstract class Teacher {
    //Nome do profesor
    protected String name;
    //Apelido do profesor
    protected String surname;
    //Direccion do profesor
    protected String adress;
    //Salario base do profesor
    protected double baseSalary;
    //Percepcion mensual
    protected double salary;

    /**
     * Constructor base que aproveitaran as subclases
     *
     * @param name       nome do profesor a crear
     * @param surname    apelido do profesor a crear
     * @param adress     direccion do profesor a crear
     * @param baseSalary base salarial do profesor a crear
     */
    public Teacher(String name, String surname, String adress, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.baseSalary = baseSalary;
    }

    public static void main(String[] args) {
        CarrerOfficer funcionario = new CarrerOfficer("Benito", "Benitez", "Rua A n12", 1500.20,
                755.75, 2007, "A coruña");

        Interim interino = new Interim("Gonzalo", "Gonzalez", "Rua B n45", 1200.50,
                300.75, "Monteporreiro");

        Substitute substituto = new Substitute("Fernando", "Fernandez", "Rua A n65", 1325.33,
                275.66, new Date(2024, Calendar.OCTOBER, 24));

        funcionario.generatePayroll();
        interino.generatePayroll();
        substituto.generatePayroll();

        System.out.println("Chamome " + funcionario.getName() + " e o meu salario e de " + funcionario.getSalary());
        System.out.println("Chamome " + interino.getName() + " e o meu salario e de " + interino.getSalary());
        System.out.println("Chamome " + substituto.getName() + " e o meu salario e de " + substituto.getSalary());

        funcionario.teach();
        interino.teach();
        substituto.teach();
    }

    /**
     * Mostra por pantalla a que se dedica este profesor
     */
    public void teach() {
        System.out.println("Dou unha clase de programación en Java");
    }

    /**
     * Calcula o salario mensual deste profesor
     */
    public abstract void generatePayroll();

    /**
     * @return nome deste profesor
     */
    public String getName() {
        return name;
    }

    /**
     * @param name nome a establecer para este profesor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return apelido deste profesor
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname apelido a establecer para este profesor
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return direccion deste profesor
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress direccion a establcer para este profesor
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return base salarial deste profesor
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary base salarial a establecer para este profesor
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * @return salario mensual deste profesor
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary salario mensual a establecer para este profesor
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
