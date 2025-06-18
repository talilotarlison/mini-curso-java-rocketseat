// Typecasting em Java é o processo de converter uma variável de um tipo de dado para outro. Existem dois tipos principais de typecasting: 
// casting implícito (ou widening) e casting explícito (ou narrowing).

// 1. Casting Implícito (Widening)
// O casting implícito ocorre quando você converte um tipo de dado menor para um tipo de dado maior. Por exemplo, converter um int para um double.
//  Isso é feito automaticamente pelo compilador, pois não há perda de dados.

// Exemplo de Casting Implícito

public class CastingImplicito {
    public static void main(String[] args) {
        int numeroInteiro = 10;
        double numeroDouble = numeroInteiro; // Casting implícito

        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número double: " + numeroDouble);
    }
}
