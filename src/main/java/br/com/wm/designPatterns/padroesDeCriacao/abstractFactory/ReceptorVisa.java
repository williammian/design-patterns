package br.com.wm.designPatterns.padroesDeCriacao.abstractFactory;

public class ReceptorVisa implements Receptor {
    @Override
    public String receber() {
        System.out.println(" Recebendo mensagem da Visa .");
        String mensagem = " Mensagem da Visa ";
        return mensagem;
    }
}
