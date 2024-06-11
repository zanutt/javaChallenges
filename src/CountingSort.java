public class CountingSort {



    public static void main(String[] args) {

        int maxElements = 10;
        int [] arrayInicial ={4, 2, 2, 8, 3, 3, 1, 7, 6, 5, 3, 2, 5, 9, 0};

        int [] arrayContagem = new int[maxElements + 1];
        for (int i = 0; i <= maxElements; i++){
            arrayContagem[i] = 0;
        }
        for (int j = 0; j < arrayInicial.length; j++){
            arrayContagem[arrayInicial[j]] = arrayContagem[arrayInicial[j]] + 1;
        }
        for (int i = 1; i <= maxElements; i++) {
            arrayContagem[i] += arrayContagem[i - 1];
        }
        int [] arrayOrdenado = new int[arrayInicial.length];
        for (int j = arrayInicial.length - 1; j >= 0; j--){
            arrayOrdenado[arrayContagem[arrayInicial[j]] - 1] = arrayInicial[j];
            arrayContagem[arrayInicial[j]] = arrayContagem[arrayInicial[j]] - 1;
        }

        System.out.print("Array após o Counting Sort é: ");
        for (int i : arrayOrdenado) {
            System.out.print(i + " ");
        }

    }
}
