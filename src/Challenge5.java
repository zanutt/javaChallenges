public class Challenge5 {
    public static void main(String[] args) {/*Crie uma matriz 5x5 de inteiros e imprima os elementos da diagonal principal e da diagonal secundária.*/
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++){
            System.out.println(matriz[i][i]);
        }
        System.out.println("Diagonal Secundaria: ");
        for (int j = 0; j < matriz.length; j++){
            System.out.println(matriz[j][matriz.length - 1 - j]);
        }
    }
}
