package br.com.wm.designPatterns.padroesEstruturais.adapter;

public class TesteControleDePonto {

    public static void main(String[] args) throws  InterruptedException {
        ControleDePonto controleDePonto = new ControleDePonto();
        Funcionario funcionario = new Funcionario("Cristiano Ronaldo");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraSaida(funcionario);
    }

}
