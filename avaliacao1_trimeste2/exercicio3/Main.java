package avaliacao1_trimeste2.exercicio3;

public class Main {
    public static void main(String[] args) {

        Estudante alunoUm = new Estudante("a",3);
        Estudante alunoDois = new Estudante("b",3);
        Estudante alunoTres = new Estudante("c",3);

        alunoUm.adicionarNotas();
        alunoDois.adicionarNotas();
        alunoTres.adicionarNotas();

        Estudante[] turma = {alunoUm,alunoDois,alunoTres};
        Estudante[] selecionados = buscarAprovados(turma);
        if(selecionados != null) {
            for (Estudante alunoAtual : selecionados) {
                System.out.println(alunoAtual.getNome());
            }
        }
    }

    public static Estudante[] buscarAprovados(Estudante[] turma){

        int totalAprovados=0,indice=0;
        for (Estudante aluno : turma){
            if(aluno.obterMedia()>=6){
                totalAprovados++;
            }
        }

        if (totalAprovados == 0 ) return null;

        Estudante[] selecionados = new Estudante[totalAprovados];

        for (Estudante aluno : turma){
            if(aluno.obterMedia()>=6) {
                selecionados[indice] = aluno;
                indice+=1;
            }
        }
        return selecionados;
    }
}

