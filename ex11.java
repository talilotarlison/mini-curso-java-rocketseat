public class ExemploMetodosArray {
    
    // Método para preencher o array com valores
    public static void preencherArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Preenchendo com valores de 1 a n
        }
    }

    // Método para calcular a soma dos elementos do array
    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    // Método para encontrar o maior elemento do array
    public static int encontrarMaior(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        // Declaração e inicialização do array
        int[] numeros = new int[5];

        // Preenchendo o array
        preencherArray(numeros);

        // Exibindo os valores do array
        System.out.println("Valores do array:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculando a soma dos elementos
        int soma = calcularSoma(numeros);
        System.out.println("Soma dos elementos: " + soma);

        // Encontrando o maior elemento
        int maior = encontrarMaior(numeros);
        System.out.println("Maior elemento: " + maior);
    }
}
