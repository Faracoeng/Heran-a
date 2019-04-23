package poo;

public class Celular extends SemFio {
    private String so;

    public Celular(int codigo, String numSerie, String modelo, float peso, Dimensao dim, float freq, float distancia, int canais, String so) {
        super(codigo, numSerie, modelo, peso, dim, freq, distancia, canais);
        this.so = so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "so='" + so + '\'' + super.toString();
    }
}
