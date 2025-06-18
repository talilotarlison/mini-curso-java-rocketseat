// Classe base Ser
public class Ser {
    private String nome;
    private String especie;

    // Construtor da classe Ser
    public Ser(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void falar() {
        System.out.println(nome + " está falando...");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
}

// Classe Pessoa que herda de Ser
public class Pessoa extends Ser {
    // Construtor da classe Pessoa que chama o construtor da classe Ser
    public Pessoa(String nome, String especie) {
        super(nome, especie);
    }

    // Sobrecarga do construtor da classe Pessoa - Polimofismo de sobrecarga no construtor
    public Pessoa(String nome) {
        super(nome, "Humano"); // Assume "Humano" como espécie padrão
    }

    @Override
    public void falar() {
        System.out.println(getNome() + " está falando com polimorfismo!"); // polimorfismo de sobreescrita
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Ser
        Ser ser = new Ser("Ser Genérico", "Desconhecido");
        ser.falar();  // Chamada do método da classe Ser

        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Alice", "Humano");
        pessoa.falar();  // Chamada do método sobrescrito da classe Pessoa

        // Polimorfismo: objeto Pessoa referenciado pelo tipo Ser
        Ser serComoPessoa = new Pessoa("Bob");
        serComoPessoa.falar();  // Invoca método sobrescrito na classe Pessoa

        // Exibindo informações
        System.out.println(serComoPessoa.getNome() + " é um " + serComoPessoa.getEspecie());
    }
}
