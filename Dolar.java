//Classe Dolar, herdando da classe modelo Moeda
public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Dolar";
    }
}
