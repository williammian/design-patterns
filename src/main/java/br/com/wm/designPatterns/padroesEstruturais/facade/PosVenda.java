package br.com.wm.designPatterns.padroesEstruturais.facade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PosVenda {

    public void agendaContato(String cliente, String produto) {
        LocalDate data = LocalDate.now();
        data = data.plusDays(30);

        System.out.println("Entrar em contato com " + cliente
            + " sobre o produto " + produto + " no dia "
            + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
