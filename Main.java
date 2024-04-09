import java.util.Scanner;

//Classe com o controle das ações tomadas pelo usuário
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcao;
        do {
            //Opções disponibilizadas
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Lógica para a inserção de uma nova moeda
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Digite o tipo da moeda (1 para Real, 2 para Dolar, 3 para Euro): ");
                    int tipo = scanner.nextInt();
                    Moeda moeda;
                    switch (tipo) {
                        case 1:
                            moeda = new Real(valor);
                            break;
                        case 2:
                            moeda = new Dolar(valor);
                            break;
                        case 3:
                            moeda = new Euro(valor);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido");
                            continue;
                    }
                    cofrinho.adicionaMoeda(moeda);
                    System.out.println("Moeda adicionada");
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 2: // Lógica para a remoção de uma moeda
                    System.out.print("Digite o id(número a frente da moeda) da moeda para remoção: ");
                    int indice = scanner.nextInt();
                    cofrinho.removeMoeda(indice - 1);
                    System.out.println("Moeda removida");
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 3: // Listagem das moedas
                    cofrinho.listaMoedas();
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 4: // Obter conversão das moedas para real
                    System.out.println("Total convertido em Reais: " + cofrinho.calculaTotalEmReal());
                    System.out.println("---------------------------------------------------------------------");
                    break;
                case 5: // Printa que está saindo do sistema
                    System.out.println("Saindo");
                    break;
                default: // Erro padrão
                    System.out.println("Opção inválida, Tente novamente");
                    System.out.println("---------------------------------------------------------------------");
            }
        } while (opcao != 5); // Opção 5 sai do sistema
    }
}
