package br.gov.serpro.game;

import java.util.ArrayList;
import java.util.List;

public class PlacarGeral {
	private List<Usuario> usarioPlacar = new ArrayList<Usuario>();
	private List<Placar> pontosUsuarioPlacar;

	public PlacarGeral(List<Usuario> usuarioPlacar, List<Placar> pontosUsuarioPlacar) {
		this.usarioPlacar = usuarioPlacar;
		this.pontosUsuarioPlacar = pontosUsuarioPlacar;
	}

	public List<Placar> retornaPlacarUsuario() {
		List<Placar> placarResultado = new ArrayList<>();
		Usuario usuario = new Usuario(this.usuarioPlacar.)
		for(Placar placar : pontosUsuarioPlacar) {
			if(pontosUsuarioPlacar.get(0).retornaPontos(usuarioPlacar))
		}
	}

}
