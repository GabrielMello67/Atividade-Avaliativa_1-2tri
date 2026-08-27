package avaliacao1_trimeste2.exercicio4;

public class Main {

    public static void main(String[] args) {
        int quantidadeNotas = 5;
        double resultadoMedia;

        Estudante alunoTeste = new Estudante("m",quantidadeNotas);

        alunoTeste.adicionarNotas();
        int[] pesosNotas = {1,2,2,3,2};
        System.out.println(alunoTeste.obterMedia(pesosNotas));
    }

}
