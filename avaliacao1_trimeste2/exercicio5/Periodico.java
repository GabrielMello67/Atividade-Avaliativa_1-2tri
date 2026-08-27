package avaliacao1_trimeste2.exercicio5;

public class Periodico extends Obra{

    private int numeroVolume;

    public Periodico(int numeroVolume, String nomeObra){
        super(nomeObra);
        this.numeroVolume = numeroVolume;
    }

    public int getVolume() {
        return numeroVolume;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    public void setVolume(int numeroVolume) {
        this.numeroVolume = numeroVolume;
    }

    @Override
    public void setTitulo(String nomeObra) {
        super.setTitulo(nomeObra);
    }
}

