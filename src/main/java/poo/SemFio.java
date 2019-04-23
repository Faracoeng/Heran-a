package poo;

public class SemFio extends Telefone {
    private float freq, distancia;
    private int canais;

    public SemFio(int codigo, String numSerie, String modelo, float peso, Dimensao dim, float freq, float distancia, int canais) {
        super(codigo, numSerie, modelo, peso, dim);
        this.freq = freq;
        this.distancia = distancia;
        this.canais = canais;
    }

    @Override
    public String toString() {
        return "SemFio{" +
                "freq=" + freq +
                ", distancia=" + distancia +
                ", canais=" + canais +
                '}'+super.toString();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Este é do Sem fio"+toString());

    }

    public void setFreq(float freq) {
        this.freq = freq;
    }
}
