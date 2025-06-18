public class Ser {
    public void falar() {
        System.out.println("O ser está falando...");
    }
}

public class Pessoa extends Ser {
    @Override
    public void falar() {
        System.out.println("A pessoa está falando com polimorfismo!");
    }

    public static void main(String[] args) {
        Ser ser = new Ser();
        ser.falar();  // Chamada método da classe Ser

        Pessoa pessoa = new Pessoa();
        pessoa.falar();  // Chamada método sobrescrito da classe Pessoa

        // Polimorfismo: objeto Pessoa referenciado pelo tipo Ser
        Ser serComoPessoa = new Pessoa();
        serComoPessoa.falar();  // Invoca método sobrescrito na classe Pessoa
    }
}

