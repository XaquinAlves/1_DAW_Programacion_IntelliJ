package UD3.actividade8apt1;

public class WaterBlocks {

    public static int calcularAgua(int[] bloques){
        int waterBloks = 0;

        for (int i = 1; i < bloques.length-1; i++) {
            int previous = bloques[i-1];
            int next = bloques[i+1];
            if(bloques[i] < previous && next > 0){
                waterBloks += previous - bloques[i];
            }else if(bloques[i] == previous && i > 1){
                    if(bloques[i-2] > bloques[i] && next >0){
                        waterBloks += bloques[i-2] - bloques[i];
                }
            }
        }

        return waterBloks;
    }
}
