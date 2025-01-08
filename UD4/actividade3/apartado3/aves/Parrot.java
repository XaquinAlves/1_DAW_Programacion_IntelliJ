package UD4.actividade3.apartado3.aves;

import UD4.actividade3.apartado3.Speaker;

/**
 * Esta clase representa un loro, cun sexo, idade, cor e rexion, e que pode falar
 */
public class Parrot extends Bird implements Speaker {
    //Rexion do loro
    private String region;
    //Cor do loro
    private String color;

    /**
     * Crea un novo loro
     *
     * @param sex sexo do loro
     * @param age idade do loro
     * @param region rexion do loro
     * @param color cor do loro
     */
    public Parrot(char sex, int age, String region, String color) {
        super(sex, age);
        this.region = region;
        this.color = color;
    }

    /**
     * Fai que o loro fale
     */
    @Override
    public void speak() {
        System.out.println("Ola son un LORO e sei falar");
        if(sex == 'm'){
            System.out.print("Sexo: masculino\t");
        }else{System.out.print("Sexo: femenino\t");}
        System.out.println("Idade: "+age);

        System.out.println("Rexion: "+region+"\tColor: "+color);
    }
}
