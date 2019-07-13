package br.com.wm.designPatterns.padroesDeCriacao.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BBBoleto implements Boleto {
    private String sacado;
    private String cedente;
    private double valor;
    private LocalDate vencimento;
    private int nossoNumero;

    public BBBoleto(String sacado, String cedente, double valor, LocalDate vencimento, int nossoNumero) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.vencimento = vencimento;
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String getSacado() {
        return sacado;
    }

    @Override
    public String getCedente() {
        return cedente;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public LocalDate getVencimento() {
        return vencimento;
    }

    @Override
    public int getNossoNumero() {
        return nossoNumero;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Boleto BB");
        stringBuilder.append("\n");

        stringBuilder.append("Sacado " + this.sacado);
        stringBuilder.append("\n");

        stringBuilder.append("Cedente " + this.cedente);
        stringBuilder.append("\n");

        stringBuilder.append("Valor " + this.valor);
        stringBuilder.append("\n");

        stringBuilder.append("Vencimento " + this.vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        stringBuilder.append("\n");

        stringBuilder.append("Nosso Número " + this.nossoNumero);
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
