public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cristiano Ronaldo");
        pessoa.setCpf("777.777.777-77");
        pessoa.setEndereço("Rua 7, Auroras - Contagem/MG - BRASIL");
        pessoa.setIdade(39);
        pessoa.setTelefone("(77) 97777-7777");
        pessoa.setEmail("cr7brabo@boladeouro.com.br");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Endereço: " + pessoa.getEndereço());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());

    }
}
