package br.com.wm.designPatterns.padroesComportamentais.state;

public class Taximetro {

	private Bandeira bandeira;

	public Taximetro(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public Bandeira getBandeira() {
		return bandeira;
	}

	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}

	public void calculaValorDaCorrida(double tempo, double distancia) {
		this.bandeira.calculaValorDaCorrida(tempo, distancia);
	}
}