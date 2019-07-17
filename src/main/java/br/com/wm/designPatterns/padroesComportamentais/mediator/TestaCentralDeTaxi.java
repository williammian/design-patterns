package br.com.wm.designPatterns.padroesComportamentais.mediator;

public class TestaCentralDeTaxi {

	public static void main(String[] args) {

		CentralDeTaxi central = new CentralDeTaxi();

		Passageiro p1 = new Passageiro(" Cristiano Ronaldo ", central);
		Passageiro p2 = new Passageiro(" Lionel Messi ", central);
		Passageiro p3 = new Passageiro(" Zinedine Zidane ", central);

		Taxi t1 = new Taxi(central);
		central.adicionaTaxiDisponivel(t1);

		Taxi t2 = new Taxi(central);
		central.adicionaTaxiDisponivel(t2);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
	}
}