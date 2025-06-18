// 2. Casting Explícito (Narrowing)
// O casting explícito é necessário quando você converte um tipo de dado maior para um tipo de dado menor. Por exemplo, converter um double para um int. Neste caso,
//  você deve usar um operador de casting, pois pode haver perda de dados.

// Exemplo de Casting Explícito

public class CastingExplicito {
    public static void main(String[] args) {
        double numeroDouble = 9.78;
        int numeroInteiro = (int) numeroDouble; // Casting explícito

        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número inteiro: " + numeroInteiro);
    }
}
