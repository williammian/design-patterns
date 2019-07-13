package br.com.wm.designPatterns.padroesEstruturais.decorator;

public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public abstract void envia(String mensagem);

    public Emissor getEmissor() {
        return this.emissor;
    }
}
