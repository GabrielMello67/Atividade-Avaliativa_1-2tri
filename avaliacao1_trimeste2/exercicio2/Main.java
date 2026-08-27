package avaliacao1_trimeste2.exercicio2;

public class Main {

    public static void main(String[] args) {
        Estudante alunoTeste = new Estudante("alunoTeste",5);

        alunoTeste.adicionarNotas();

        for (double notaAtual : alunoTeste.getNotas()){
            System.out.println(notaAtual);
        }

        System.out.println(alunoTeste.obterMedia());
        System.out.println(alunoTeste.pegarMenorNota());
    }

}
