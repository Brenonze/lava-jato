public class ServicoLavagem {
    private String tipo;
    private double preco;

    public ServicoLavagem(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public ServicoLavagem() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método polimórfico para realizar o pagamento do serviço
    public void pagar(String formaPagamento) {
        System.out.println("Pagamento de R$ " + preco + " realizado via " + formaPagamento +
                ". Obrigado! Volte sempre!");
    }
}
