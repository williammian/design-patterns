package br.com.wm.designPatterns.padroesDeCriacao.abstractFactory;

public class VisaComunicadorFactory implements ComunicadorFactory {

    private EmissorCreator emissorCreator = new EmissorCreator ();
    private ReceptorCreator receptorCreator = new ReceptorCreator ();

    @Override
    public Emissor createEmissor() {
        return emissorCreator.create(EmissorCreator.VISA);
    }

    @Override
    public Receptor createReceptor() {
        return receptorCreator.create(ReceptorCreator.VISA);
    }

}
