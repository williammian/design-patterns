package br.com.wm.designPatterns.padroesDeCriacao.abstractFactory;

public class EmissorVisa implements Emissor {
    @Override
    public void envia(String mensagem) {
        System.out.println(" Enviando a seguinte mensagem para a Visa :");
        System.out.println( mensagem );
    }
}
