package Matrizes;

public class Challenge3 {/*Crie uma matriz 3x3 e calcule a sua matriz transposta.*/
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizTransposta = new int[3][3];
        for (int i = 0; i < matrizTransposta.length; i++){
            for (int j = 0; j < matrizTransposta[i].length; j++){
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        int somaTransposta = 0;
        for (int posx = 0; posx < matrizTransposta.length; posx++){
            for (int posy = 0; posy < matrizTransposta[posx].length; posy++){
                somaTransposta += matrizTransposta[posx][posy];
            }
        }
        System.out.println("A soma da matriz tranposta: "+ somaTransposta);
    }
}
