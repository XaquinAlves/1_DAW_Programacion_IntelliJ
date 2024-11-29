package UD3.actividade8apt1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WaterBlocks {

    public static int calcularAgua(int[] bloques) {
        int waterBlocks = 0;

        boolean[][] areBlocks = new boolean[obtainGreater(bloques)][bloques.length];

        for (int i = areBlocks.length-1; i >=0; i--) {
            for (int j = 0; j < bloques.length; j++) {
                if(bloques[j] == i+1){
                    areBlocks[i][j] = true;
                }
            }
        }

        boolean[][] areWaterBlocks = new boolean[obtainGreater(bloques)][bloques.length];

        for (int i = 0; i < areWaterBlocks.length; i++) {
            for (int j = 0; j < areWaterBlocks[i].length; j++) {
                areWaterBlocks[i][j] = false;
            }
        }
        int open = -1;

        for (int i = 0; i < areWaterBlocks.length; i++) {
            open = -1;
            for (int j = 0; j < areWaterBlocks[i].length; j++) {
                if (areBlocks[i][j] && open == -1) {
                    open = j;
                } else if (areBlocks[i][j] && open > -1 &&(open+1)<j) {
                    for (int k = open + 1; k < j; k++) {
                        areWaterBlocks[i][k] = true;
                        open = -1;
                    }
                }
            }
        }

        for (boolean[] waterBlockRow : areWaterBlocks) {
            for (boolean waterBlock : waterBlockRow) {
                if (waterBlock) {
                    waterBlocks++;
                }
            }
        }

        return waterBlocks;
    }

    private static int obtainGreater(int[] numbers) {
        int greater = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > greater) {
                greater = number;
            }
        }
        return greater;
    }

    public static void main(String[] args) {
        Map<Character, int[]> map = new TreeMap<>();
        Map<Character, Integer> resultados = new HashMap<>();

        int[] a = {2, 7, 3, 5, 1, 0, 5};
        int[] b = {4, 0, 3, 6, 1, 3};
        int[] c = {4, 2, 1, 5, 2, 5, 3, 4};
        int[] d = {0, 7, 1, 3, 5, 6, 0, 4};
        int[] e = {4, 0, 3, 6, 1, 3};
        int[] f = {5, 1, 3, 8, 4, 2, 1, 0, 4, 2, 3};
        int[] g = {8, 1, 6, 3, 4, 0, 3, 0, 2, 0, 1};
        int[] h = {1, 0, 2, 0, 3, 0, 4, 3, 6, 1, 8};
        int[] i = {6, 3, 0, 1, 7, 2, 4, 2, 6};
        int[] j = {6, 3, 6, 1, 5, 2, 5, 2, 6};
        int[] k = {0, 1, 2, 3, 2, 2, 1, 1, 0};

        map.put('a', a);
        resultados.put('a', 11);

        map.put('b', b);
        resultados.put('b', 7);

        map.put('c', c);
        resultados.put('c', 9);

        map.put('d', d);
        resultados.put('d', 13);

        map.put('e', e);
        resultados.put('e', 7);

        map.put('f', f);
        resultados.put('f', 16);

        map.put('g', g);
        resultados.put('g', 12);

        map.put('h', h);
        resultados.put('h', 12);

        map.put('i', i);
        resultados.put('i', 24);

        map.put('j', j);
        resultados.put('j', 18);

        map.put('k', k);
        resultados.put('k', 0);

        //map.put('r', random);

        for (Map.Entry<Character, int[]> entry : map.entrySet()) {
            int resultado = calcularAgua(entry.getValue());
            if (resultado == resultados.get(entry.getKey())) {
                System.out.println("Caso " + entry.getKey() + ": OK");
            } else {
                System.out.println("Caso " + entry.getKey() + ": FAIL. " + Arrays.toString(entry.getValue()) + " Expected: " + resultados.get(entry.getKey()) + " | Found: " + resultado);
            }
        }
    }
}


