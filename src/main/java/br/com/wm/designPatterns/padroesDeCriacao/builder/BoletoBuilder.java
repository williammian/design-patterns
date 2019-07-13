package br.com.wm.designPatterns.padroesDeCriacao.builder;

import java.time.LocalDate;

public interface BoletoBuilder {
    void buildSacado(String sacado);
    void buildCedente(String cedente);
    void buildValor(double valor);
    void buildVencimento(LocalDate vencimento);
    void buildNossoNumero(int nossoNumero);

    Boleto getBoleto();
}
