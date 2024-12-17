package UD4.actividade2;

/**
 * Esta clase representa a un funcionario de carreira, que é un tipo de profesor(Subclase de Teacher)
 *
 * @author Xaquin Alves Gonzalez
 */
public class CarrerOfficer extends Teacher {
    //Complemento salarial
    private double officerComplement;
    //Ano de oposicion
    private int oppositionYear;
    //Lugar de oposicion
    private String oppositionPlace;

    /**
     * Crea un novo funcionario de carreira
     *
     * @param name              nome do fdc
     * @param surname           apelido do fdc
     * @param adress            direccion do fdc
     * @param baseSalary        base salarial do fdc
     * @param officerComplement complemento salarial do fdc
     * @param oppositionYear    ano de oposicion do fdc
     * @param oppositionPlace   lugar de oposicion do fdc
     */
    public CarrerOfficer(String name, String surname, String adress, double baseSalary, double officerComplement, int oppositionYear, String oppositionPlace) {
        super(name, surname, adress, baseSalary);
        this.officerComplement = officerComplement;
        this.oppositionYear = oppositionYear;
        this.oppositionPlace = oppositionPlace;
    }

    /**
     * Calcula o salario mensual deste funcionario de carreira
     */
    @Override
    public void generatePayroll() {
        salary = baseSalary + officerComplement;
    }

    /**
     * @return complemento salarial deste funcionario de carreira
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * @param officerComplement complemento salarial a estaplecer para este funcionario de carreira
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * @return ano de oposicion deste funcionario de carreira
     */
    public int getOppositionYear() {
        return oppositionYear;
    }

    /**
     * @param oppositionYear ano de oposicion a establecer para este fdc
     */
    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    /**
     * @return lugar de oposicion deste fdc
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * @param oppositionPlace lugar de oposicion a establecer para este fdc
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }
}
