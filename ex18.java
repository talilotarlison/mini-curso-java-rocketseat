// exeplo de while
// 2. Laço while
// O laço while é usado quando você não sabe quantas vezes deseja iterar, mas deseja continuar enquanto uma condição for verdadeira.

public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("Contagem de 1 a 5 usando while:");
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }
    }
}
