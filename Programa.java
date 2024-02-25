public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("O Príncipe");
        livro.setId(99);
        livro.setAutor("Neymar JR");
        livro.setDataLancamento("12/06/1998");
        livro.setValor(215.00);

        System.out.println("Nome do Livro: " + livro.getNome());
        System.out.println("Número de Identificação: " + livro.getId());
        System.out.println("Autor: " + livro.getAutor());
        System.out.printf("Data de Lançamento: " + livro.getDataLancamento());
        System.out.printf("\nValor: R$ %.2f%n", livro.getValor());
    }
}
