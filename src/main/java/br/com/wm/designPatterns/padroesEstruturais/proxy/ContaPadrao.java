package br.com.wm.designPatterns.padroesEstruturais.proxy;

public class ContaPadrao implements Conta {

	private double saldo ;
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}
}