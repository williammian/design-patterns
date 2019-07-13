package br.com.wm.designPatterns.padroesEstruturais.adapter;

public class TesteControleDePonto2 {

    public static void main(String[] args) throws  InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario("Cristiano Ronaldo");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraSaida(funcionario);
    }

}
