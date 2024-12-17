package UD4.actividade2;

import java.util.Date;

/**
 * Esta clase representa a un profesor substituto
 *
 * @author Xaquin Alves Gonzalez
 */
public class Substitute extends Teacher {
    //Complemento salarial por desprazamento
    private double displacement;
    //Data de inicio da sustitucion
    private Date initDate;

    /**
     * Crea un novo profesor substituto
     *
     * @param name         nome do substituto
     * @param surname      apelido do substituto
     * @param adress       direccion do substituto
     * @param baseSalary   base salarial do substituto
     * @param displacement complemento salarial  por desplazamento do substituto
     * @param initDate     fecha de inicio da substitucion
     */
    public Substitute(String name, String surname, String adress, double baseSalary, double displacement, Date initDate) {
        super(name, surname, adress, baseSalary);
        this.displacement = displacement;
        this.initDate = initDate;
    }

    /**
     * Calcula o salario mensual deste profesor sustituto
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + displacement;
    }

    /**
     * Mostra por pantalla a que se dedica este profesor
     */
    @Override
    public void teach() {
        System.out.println("Substituo unha clase de programacion en Java");
    }

    /**
     * @return complemento salarial por desplazamento
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * @param displacement complemento salarial a establecer
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * @return data de inicio da substitucion
     */
    public Date getInitDate() {
        return initDate;
    }

    /**
     * @param initDate data de inicio da substitucion a establecer
     */
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }
}
