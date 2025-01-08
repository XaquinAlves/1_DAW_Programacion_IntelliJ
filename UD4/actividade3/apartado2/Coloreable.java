package UD4.actividade3.apartado2;

import java.awt.Color;

/**
 * Esta interface fai referencia a calquer obxeto que admita unha cor
 *
 * @author Xaquin Alves Gonzalez
 */
public interface Coloreable {
    /**
     * Obten a cor do obxeto
     *
     * @return cor do obxeto
     */
    Color getColor();

    /**
     * Cambia a cor do obxeto
     *
     * @param c cor a establecer
     */
    void setColor(Color c);

}
