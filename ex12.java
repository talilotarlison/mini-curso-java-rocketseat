import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criação de um ArrayList para armazenar nomes
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carlos");
        nomes.add("Diana");
        nomes.add("Eduardo");
        nomes.remove("Alice");
        nomes.get("Eduardo");
        nomes.size();

        // Exibindo os elementos do ArrayList
        System.out.println("Nomes no ArrayList:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Obtendo o tamanho do ArrayList
        System.out.println("Total de nomes: " + nomes.size());

        // Verificando se um nome está no ArrayList
        String nomeParaBuscar = "Carlos";
        if (nomes.contains(nomeParaBuscar)) {
            System.out.println(nomeParaBuscar + " está na lista.");
        } else {
            System.out.println(nomeParaBuscar + " não está na lista.");
        }

        // Removendo um elemento do ArrayList
        nomes.remove("Bob");
        System.out.println("Após remover Bob:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Acessando um elemento específico
        String primeiroNome = nomes.get(0);
        System.out.println("Primeiro nome na lista: " + primeiroNome);
    }
}
