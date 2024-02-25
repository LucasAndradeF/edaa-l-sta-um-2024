public class ProgramaUniversidade {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        Disciplina disciplina = new Disciplina(); 
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        aluno.setNome("Lionel Messi");
        aluno.setMatricula("95452015");
        universidade.setCursos("Ciência da Computação");
        professor.setNome("Daniel Paiva");
        disciplina.setMateria("Estrutura de dados e Algoritmos");

        String dados = listarDados(aluno, universidade, professor, disciplina); 
        System.out.println(dados);
    }

    public static String listarDados(Aluno aluno, Universidade universidade, Professor professor,
            Disciplina disciplina) {
        return "Informações do Aluno:\n" +
                "Nome: " + aluno.getNome() + "\n" +
                "Matrícula: " + aluno.getMatricula() + "\n\n" +
                "Informações da Universidade:\n" +
                "Curso: " + universidade.getCursos() + "\n\n" +
                "Informações do Professor:\n" +
                "Nome: " + professor.getNome() + "\n\n" +
                "Informações da Disciplina:\n" +
                "Matéria: " + disciplina.getMateria() + "\n";
    }
}
