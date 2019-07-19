package br.com.wm.designPatterns.padroesComportamentais.visitor;

public interface Atualizavel {
	void aceita(AtualizadorDeFuncionario atualizador);
}