package avaliacao1_trimeste2.exercicio3;

import java.util.Scanner;

public class Estudante {

    private String nomeAluno;
    private double[] listaNotas;

    public int quantidadeNotas;

    public Estudante(String nomeAluno, int quantidadeNotas){
        this.nomeAluno = nomeAluno;
        this.listaNotas = new double[quantidadeNotas];
        this.quantidadeNotas = quantidadeNotas;
    }

    public void adicionarNotas(){
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<quantidadeNotas; i++){
            System.out.print("Digite a " + i+1 + "ª valorNota: ");
            listaNotas[i] = entrada.nextDouble();
        }
    }

    public double obterMedia(){

        double somaNotas = 0;
        
        for (double valorNota : this.getNotas()){
            somaNotas+=valorNota;
        }
        somaNotas/=quantidadeNotas;
        
        return somaNotas;
    }

    public double pegarMenorNota(){

        double[] notasAtuais = this.getNotas();
        double pegarMenorNota = notasAtuais[0];

        for (double valorNota : notasAtuais){
            if(valorNota<pegarMenorNota){
                pegarMenorNota = valorNota;
            }
        }

        return pegarMenorNota;
    }

    public double[] getNotas() {
        return listaNotas;
    }

    public String getNome() {
        return nomeAluno;
    }

    public int getQtdNotas() {
        return quantidadeNotas;
    }

    public void setNotas(double[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void setNome(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setQtdNotas(int quantidadeNotas) {
        this.quantidadeNotas = quantidadeNotas;
    }
}
