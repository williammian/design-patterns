package br.com.wm.designPatterns.padroesComportamentais.templateMethod;

public class ContaPoupanca extends Conta {

	@Override
	public double calculaTaxa() {
		return 1;
	}
}