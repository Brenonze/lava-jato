public class Higienizacao extends ServicoLavagem {

    public Higienizacao(String tipo, double preco) {
        super(tipo, preco);
    }

    public Higienizacao() {
    }

    @Override
    public void pagar(String formaPagamento) {
        super.pagar(formaPagamento);
    }
}
