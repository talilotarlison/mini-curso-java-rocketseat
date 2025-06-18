// 3. Laço do-while
// O laço do-while é semelhante ao while, mas garante que o bloco de código seja executado pelo menos uma vez, pois a condição
//  é verificada após a execução do bloco.

public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("Contagem de 1 a 5 usando do-while:");
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 5);
    }
}
