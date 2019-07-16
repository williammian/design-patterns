package br.com.wm.designPatterns.padroesComportamentais.command;

public class AumentaVolumeComando implements Comando {

	private Player player;
	private int levels;

	public AumentaVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executa() {
		this.player.increaseVolume(this.levels);
	}
}