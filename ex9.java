public class ExemploArray {
    public static void main(String[] args) {
        // Declaração e inicialização do array
        String[] nomes = new String[5];

        // Preenchendo o array com valores
        nomes[0] = "Alice";
        nomes[1] = "Bob";
        nomes[2] = "Carlos";
        nomes[3] = "Diana";
        nomes[4] = "Eduardo";

        // Exibindo os valores do array
        System.out.println("Nomes no array:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes[" + i + "] = " + nomes[i]);
        }
    }
}
