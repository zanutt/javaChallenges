public class LinearSearch {
    public static void main(String[] args) {
        double[] arrayTest = {12.5, 3.7, 45.2, 19.1, 8.3};
        double alvo = 19.1;
        boolean encontrado = false;
        int indice = -1;

        for (int pos = 0; pos < arrayTest.length; pos++) {
            if (arrayTest[pos] == alvo) {
                encontrado = true;
                indice = pos;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Numero alvo " + alvo + " encontrado, no indice: " + indice + " ou na posição: " + (indice + 1) + " do array");
        } else {
            System.out.println("Numero alvo nao encontrado no array");
        }
    }
}
