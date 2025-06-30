package br.com.aplicando.solid.ocp_dip;

public class executeOcpDip {
    public static void main(String[] args) {
        TabelaDePreco tabela = new TabelaDePrecoDiferenciada();
        ServicoDeEntrega entrega = new Frete();
        new CalculadoraDePrecos(tabela, entrega);
    }
}