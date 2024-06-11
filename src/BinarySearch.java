
/*função binarySearch(lista, alvo):
    inicio = 0
    fim = comprimento(lista) - 1

    enquanto inicio <= fim:
        meio = (inicio + fim) / 2

        se lista[meio] == alvo:
            retorna meio
        senão se lista[meio] < alvo:
            inicio = meio + 1
        senão:
            fim = meio - 1

    retorna -1

função principal:
    lista = [elementos ordenados da lista]
    alvo = valor que você deseja procurar

    resultado = binarySearch(lista, alvo)

    se resultado != -1:
        imprime "Elemento encontrado no índice: " + resultado
    senão:
        imprime "Elemento não encontrado."*/

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class BinarySearch {

    public static void main(String[] args) {
        int[] arrayTest = {1,12,35,45,75,85,94,95};

        Random rand = new Random();
        // int randomIndex = ThreadLocalRandom.current().nextInt(arrayTest.length);

        int min = 1;
        int max = 95;
        int alvo = rand.nextInt((max - min)) + min;
        boolean encontrado = false;
        System.out.println("O alvo é: "+ alvo);

        int inicioLista = 0;
        int finalLista = arrayTest.length;

        while (inicioLista <= finalLista){
            int meio = (inicioLista + finalLista) /2;
            if (arrayTest[meio] == alvo) {
                System.out.println("Alvo encontrado no indice " +meio+ " do array!!");
                encontrado = true;
                break;
            } else if (arrayTest[meio] < alvo) {
                inicioLista = meio + 1;
            }else {
                finalLista = meio -1;
            }
        }
        if (!encontrado){
            System.out.println("O alvo "+ alvo + " Não encontrado no array");
        }
    }

}
