package br.com.wm.designPatterns.padroesDeCriacao.abstractFactory;

public class ReceptorMastercard implements Receptor {
    @Override
    public String receber() {
        System.out.println(" Recebendo mensagem da Mastercard .");
        String mensagem = " Mensagem da Mastercard ";
        return mensagem;
    }
}
