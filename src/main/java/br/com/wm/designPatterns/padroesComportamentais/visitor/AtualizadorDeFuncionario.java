package br.com.wm.designPatterns.padroesComportamentais.visitor;

public interface AtualizadorDeFuncionario {
	void atualiza(Gerente g);
	void atualiza(Telefonista t);
}