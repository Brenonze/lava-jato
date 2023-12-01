public class LavagemPolimento extends ServicoLavagem {

    public LavagemPolimento(String tipo, double preco) {
        super(tipo, preco);
    }

    public LavagemPolimento() {
    }

    @Override
    public void pagar(String formaPagamento) {
        super.pagar(formaPagamento);
    }
}
