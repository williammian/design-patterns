package br.com.wm.designPatterns.padroesDeCriacao.factoryMethod;

public class TestaEmissores {

    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();

        // SMS
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.envia(" Msg emissor 1 SMS ");

        // Email
        Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.envia(" Msg emissor 2 E-mail ");

        // JMS
        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.envia(" Msg emissor 3 JMS ");
    }

}
