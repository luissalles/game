package br.gov.serpro.game;

public class Placar {
	private Usuario usuario;
	private Ponto pontos;

	
	public Placar(Usuario usuario, Ponto pontos) {
		this.usuario = usuario;
		this.pontos = pontos;
	}

	public void registrarPonto(Usuario usuario, Ponto pontos) {
		this.usuario = usuario;
		this.pontos.setQuantidadePontos(this.pontos.getQuantidadePontos() + pontos.getQuantidadePontos());
	}

	public int retornaPontos(Usuario usuario, Ponto pontos) {
		this.usuario = usuario;
		if(pontos.getTipoPonto() == "Estrela")
			return pontos.getQuantidadePontos();
		return 0;
	}

}
