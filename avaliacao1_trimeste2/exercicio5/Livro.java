package avaliacao1_trimeste2.exercicio5;

public class Livro extends Obra{

    private boolean estaLivre;

    public Livro(String nomeObra){
        super(nomeObra);
        this.estaLivre = true;
    }

    public boolean verificarDisponibilidade(){

        if(this.estaLivre){
            System.out.print("disponível");
        }
        else{
            System.out.print("emprestado");
        }

        return this.estaLivre;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public void setTitulo(String nomeObra) {
        super.setTitulo(nomeObra);
    }

    public void realizarEmprestimo(){
        if(!this.estaLivre){
            System.out.println("Este livro não está disponível para empréstimo.");
            return;
        }
        else{
            System.out.println("Empréstimo realizado com sucesso.");
            this.estaLivre = false;
            return;
        }
    }

    public void registrarDevolucao(){
        if(this.estaLivre){
            System.out.println("Este livro já está disponível.");
            return;
        }
        else{
            System.out.println("Devolução realizada com sucesso.");
            this.estaLivre = true;
            return;
        }
    }
}