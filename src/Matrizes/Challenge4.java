package Matrizes;

public class Challenge4 {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2},
                {3, 4}
        };
        int[][] matrizB = {
                {5, 6},
                {7, 8}
        };
        int[][] matrizResultado = new int[2][2];

        for (int i = 0; i < matrizA.length; i++){
            for (int j = 0; j < matrizA[i].length; j++){
                matrizResultado[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }
        System.out.println("A Matriz resultado da multiplicação: ");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                System.out.print(matrizResultado[i][j]+ " ");
            }
            System.out.println();
        }
        int soma = 0;
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                soma += matrizResultado[i][j];
            }
        }

        System.out.println("A soma da matriz é: "+soma);

    }
}
