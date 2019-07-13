package br.com.wm.designPatterns.padroesEstruturais.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControleDePonto {

    public void registraEntrada(Funcionario f) {
        System.out.println(" Entrada : " + f.getNome() + " às " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:s")));
    }

    public void registraSaida(Funcionario f) {
        System.out.println(" Saída : " + f.getNome() + " às " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:s")));
    }

}
