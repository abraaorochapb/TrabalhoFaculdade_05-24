//Classe Real, herdando da classe modelo Moeda
public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String getNome() {
        return "Real";
    }
}
