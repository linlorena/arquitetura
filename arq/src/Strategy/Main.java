package Strategy;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        // Definindo o método de pagamento como cartão de crédito
        sistemaPagamento.setMetodoPagamento(new PagamentoCartaoCredito());
        sistemaPagamento.realizarPagamento(100.00);

        // Mudando o método de pagamento para PayPal
        sistemaPagamento.setMetodoPagamento(new PagamentoPayPal());
        sistemaPagamento.realizarPagamento(200.00);

        // Mudando o método de pagamento para boleto
        sistemaPagamento.setMetodoPagamento(new PagamentoBoleto());
        sistemaPagamento.realizarPagamento(300.00);
    }
}
