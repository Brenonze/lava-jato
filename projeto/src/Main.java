import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ServicoLavagem> servicos = new ArrayList<>();
        LavagemSimples lavagem = new LavagemSimples("Lavagem Simples",50.00);
        LavagemCompleta lavagemcompleta = new LavagemCompleta("Lavagem Completa",100.00);
        PurificacaoAr purificacaoAr = new PurificacaoAr("Purificação de Ar",50.00);
        Higienizacao higienizacao = new Higienizacao("Higienização",25.00);

        servicos.add(lavagem);
        servicos.add(lavagemcompleta);
        servicos.add(purificacaoAr);
        servicos.add(higienizacao);

        System.out.println("Bem-vindo ao Lava Jato dos Irmãos JP!");

        exibirServicos(servicos);

        System.out.print("\nEscolha o número do serviço desejado: ");
        int escolha = scanner.nextInt();

        if (escolha >= 1 && escolha <= servicos.size()) {
            ServicoLavagem servicoEscolhido = servicos.get(escolha - 1);
            System.out.println("\nVocê escolheu: " + servicoEscolhido.getTipo());
            System.out.println("Valor a pagar: R$ " + servicoEscolhido.getPreco());

            System.out.println("\nFormas de pagamento disponíveis:");
            System.out.println("1. PIX");
            System.out.println("2. Cartão de Crédito");
            System.out.println("3. Cartão de Débito");
            System.out.println("4. Dinheiro");

            System.out.print("\nEscolha a forma de pagamento desejada: ");
            int formaPagamentoEscolhida = scanner.nextInt();

            String formaPagamento;
            switch (formaPagamentoEscolhida) {
                case 1:
                    formaPagamento = "PIX";
                    break;
                case 2:
                    formaPagamento = "Cartão de Crédito";
                    break;
                case 3:
                    formaPagamento = "Cartão de Débito";
                    break;
                case 4:
                    formaPagamento = "Dinheiro";
                    break;
                default:
                    formaPagamento = "Forma de pagamento inválida";
            }

            // Pagamento polimórfico
            servicoEscolhido.pagar(formaPagamento);
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    public static void exibirServicos(List<ServicoLavagem> servicos) {
        System.out.println("\nServiços disponíveis:");
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println((i + 1) + ". " + servicos.get(i).getTipo() +
                    " - R$ " + servicos.get(i).getPreco());
        }
    }
}