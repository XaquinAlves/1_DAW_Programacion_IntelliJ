package UD4.actividade2;

/**
 * Esta clase representa a un profesor interino
 *
 * @author Xaquin Alves Gonzalez
 */
public class Interim extends Teacher {
    //Complemento salarial
    private double interimComplement;
    //Lugar de destino
    private String destination;

    /**
     * Crea un novo profesor interino
     *
     * @param name              nome do interino
     * @param surname           apelido do interino
     * @param adress            direccion do interino
     * @param baseSalary        base salarial do interino
     * @param interimComplement complemento salarial do interino
     * @param destination       lugar de destino do interino
     */
    public Interim(String name, String surname, String adress, double baseSalary, double interimComplement, String destination) {
        super(name, surname, adress, baseSalary);
        this.interimComplement = interimComplement;
        this.destination = destination;
    }

    /**
     * Calcula o salario mensual deste interino
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + interimComplement;
    }

    /**
     * @return complemento salarial deste interino
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * @param interimComplement complemento salarial a establecer
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * @return lugar de destino deste interino
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination lugar de destino a establecer
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
}
