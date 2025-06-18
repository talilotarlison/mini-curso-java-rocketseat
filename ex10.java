public class ExemploArrayDireto {
    public static void main(String[] args) {
        // Inicialização direta do array
        String[] nomes = {"Alice", "Bob", "Carlos", "Diana", "Eduardo"};
        System.out.println( nomes.length);
        // Exibindo os valores do array
        System.out.println("Nomes no array:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes[" + i + "] = " + nomes[i]);
        }
    }
}
