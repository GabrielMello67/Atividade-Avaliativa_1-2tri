package avaliacao1_trimeste2.exercicio5;

public class Main {

    public static void main(String[] args) {

        Livro livroTeste = new Livro("A Empregada");

        boolean livroLivre = livroTeste.verificarDisponibilidade();
        System.out.printf("\n");
        if(livroLivre){
            System.out.println("Return funciona");
        }
        livroTeste.realizarEmprestimo();
        livroLivre = livroTeste.verificarDisponibilidade();
        System.out.printf("\n");
        livroTeste.realizarEmprestimo();
        if(!livroLivre){
            System.out.println("Return funciona");
        }
        livroTeste.registrarDevolucao();
        livroTeste.verificarDisponibilidade();
        System.out.printf("\n");
        livroTeste.registrarDevolucao();
    }
}
