// Classe modelo
public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract String getNome();
    public double getValor() {
        return valor;
    }
}
