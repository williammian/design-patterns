package br.com.wm.designPatterns.padroesEstruturais.facade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Estoque {

    public void enviaProduto(String produto, String enderecoDeEntrega) {
        LocalDate data = LocalDate.now();
        data = data.plusDays(2);

        System.out.println("O produto " + produto
            + " será entregue no endereço " + enderecoDeEntrega
            + " até as 18h do dia " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
