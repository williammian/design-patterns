package br.com.wm.designPatterns.padroesEstruturais.facade;

public class TestePedidoFacade {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Financeiro financeiro = new Financeiro();
        PosVenda posVenda = new PosVenda();
        PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
        Pedido pedido = new Pedido("Notebook", "Cristiano Ronaldo",
                "Av. Brigadeiro Faria Lima, 2000, São Paulo, SP");
        facade.registraPedido(pedido);
    }

}
