package br.com.wm.designPatterns.padroesEstruturais.adapter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ControleDePontoNovo {

    public void registra(Funcionario f, boolean entrada) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy H:m:s");
        LocalDateTime dataHora = LocalDateTime.now();

        if(entrada) {
            System.out.println("Entrada " + f.getNome() + " às " + dataHora.format(dtf));
        } else {
            System.out.println("Saída " + f.getNome() + " às " + dataHora.format(dtf));
        }
    }

}
