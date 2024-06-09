import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        double[] arrayStart = {12.5, 3.7, 45.2, 19.1, 8.3};
        System.out.println("Array Inicial: "+Arrays.toString(arrayStart));

        for (int pos = 0; pos< (arrayStart.length-1); pos++){
            boolean swapped = false;
            for (int pos2 = 0; pos2<(arrayStart.length-1-pos); pos2++)
                if (arrayStart[pos2] > arrayStart[pos2+1]){
                    double varTemporaria = arrayStart[pos2];
                    arrayStart[pos2] = arrayStart[pos2+1];
                    arrayStart[pos2 + 1] = varTemporaria;
                    swapped = true;

            }if (!swapped){
                    break;
            }

        }
        System.out.println("Array Ordenado: "+Arrays.toString(arrayStart));


    }
}
