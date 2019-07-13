package br.com.wm.designPatterns.padroesDeCriacao.abstractFactory;

public interface ComunicadorFactory {
    Emissor createEmissor();
    Receptor createReceptor();
}
