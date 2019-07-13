package br.com.wm.designPatterns.padroesEstruturais.adapter;

public class ControleDePontoAdapter extends ControleDePonto {
    private ControleDePontoNovo controleDePontoNovo;

    public ControleDePontoAdapter () {
        this.controleDePontoNovo = new ControleDePontoNovo();
    }

    @Override
    public void registraEntrada(Funcionario f) {
        this.controleDePontoNovo.registra(f, true);
    }

    @Override
    public void registraSaida(Funcionario f) {
        this.controleDePontoNovo.registra(f, false);
    }
}
