package br.gov.serpro.game;

public class Pontos {
	private String tipoPonto;
	private int quantidadePontos;

	public Pontos(String tipoPonto, int quantidadePontos) {
		this.tipoPonto = tipoPonto;
		this.quantidadePontos = quantidadePontos;
	}
	
	public void setQuantidadePontos(int quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}

	public int getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setTipoPonto(String tipoPonto) {
		this.tipoPonto = tipoPonto;
	}

	public String getTipoPonto() {
		return tipoPonto;
	}

}
