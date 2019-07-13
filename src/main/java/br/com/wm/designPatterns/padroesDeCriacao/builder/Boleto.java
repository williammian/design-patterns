package br.com.wm.designPatterns.padroesDeCriacao.builder;

import java.time.LocalDate;

public interface Boleto {
    String getSacado();
    String getCedente();
    double getValor();
    LocalDate getVencimento();
    int getNossoNumero();
    String toString();
}
