package avaliacao1_trimeste2.exercicio5;

public class Obra {

    protected String nomeObra;

    public Obra(String nomeObra){
        this.nomeObra = nomeObra;
    }

    public String getTitulo() {
        return nomeObra;
    }

    public void setTitulo(String nomeObra) {
        this.nomeObra = nomeObra;
    }
}
