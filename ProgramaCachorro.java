public class ProgramaCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setId(1);
        cachorro.setTipo("doméstico");
        cachorro.setHabitat("terrestre");
        cachorro.setNome("Rex");
        cachorro.setRaca("Pitbull");
        cachorro.setIdade(3);


        System.out.println("Dados do cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());

        System.out.println("\nRex, late!");
        String latido = cachorro.latir();
        System.out.println(latido);
    }
}
