public class ExemploVetor {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor
        int[] numeros = new int[5]; //  vetor tenho que definir tamanho fixo

        // Preenchendo o vetor com valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 2; // Atribuindo valores (0, 2, 4, 6, 8)
        }

        // Exibindo os valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
