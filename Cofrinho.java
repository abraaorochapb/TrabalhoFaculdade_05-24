import java.util.ArrayList;

// métodos contendo as implementações dos requisitos
public class Cofrinho {
    private ArrayList<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    //Método para adicionar uma nova moeda
    public void adicionaMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    //Método para remover uma moeda
    public void removeMoeda(int i) {
        moedas.remove(i);
    }

    //Método para listagem das moedas
    public void listaMoedas() {
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i+1) + ". " + moedas.get(i).getNome() + ": " + moedas.get(i).getValor());
        }
    }

    //Método para calcular o valor total
    public double calculaTotal() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.getValor();
        }
        return total;
    }

    //Método para calcular o valor total em reais
    public double calculaTotalEmReal() {
        double totalEmReal = 0;
        for (Moeda moeda : moedas) {
            if (moeda instanceof Real) {
                totalEmReal += moeda.getValor();
            } else if (moeda instanceof Dolar) {
                totalEmReal += moeda.getValor() * 4;
            } else if (moeda instanceof Euro) {
                totalEmReal += moeda.getValor() * 6;
            }
        }
        return totalEmReal;
    }
}
