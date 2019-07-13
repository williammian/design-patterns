package br.com.wm.designPatterns.padroesDeCriacao.builder;

import java.time.LocalDate;

public class GeradorDeBoleto {
    private BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto gerarBoleto() {
        this.boletoBuilder.buildSacado("William Mian");
        this.boletoBuilder.buildCedente("Empresa XYZ");
        this.boletoBuilder.buildValor(150.65);

        LocalDate vencimento = LocalDate.now().plusDays(30);
        this.boletoBuilder.buildVencimento(vencimento);

        this.boletoBuilder.buildNossoNumero(12345);
        Boleto boleto = boletoBuilder.getBoleto();

        return boleto;
    }
}
