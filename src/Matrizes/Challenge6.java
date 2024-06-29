package Matrizes;

public class Challenge6 {
    public static void main(String[] args) {/* Dada uma matriz NxN, escreva um programa para rotacioná-la 90 graus no sentido horário.*/
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matriz.length;
        int[][] matrizRotacionada = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrizRotacionada[j][n - 1 - i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Rotacionada 90 graus no sentido horário: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
