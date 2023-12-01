public class LavagemSimples extends ServicoLavagem {

    public LavagemSimples(String tipo, double preco) {
        super(tipo, preco);
    }

    public LavagemSimples() {
    }

    @Override
    public void pagar(String formaPagamento) {
        super.pagar(formaPagamento);
    }
}
