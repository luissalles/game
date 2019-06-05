package br.gov.serpro.game;

public class Placar {
	private Usuario usuario;
	private Pontos pontos;

	
	public Placar(Usuario usuario, Pontos pontos) {
		this.usuario = usuario;
		this.pontos = pontos;
	}

	public void registrarPonto(Usuario usuario, Pontos pontos) {
		this.usuario = usuario;
		this.pontos.setQuantidadePontos(this.pontos.getQuantidadePontos() + pontos.getQuantidadePontos());
	}

	public int RetornaPontos(Usuario usuario, Pontos pontos) {
		this.usuario = usuario;
		if(pontos.getTipoPonto() == "Estrela")
			return pontos.getQuantidadePontos();
		return 0;
	}

}
