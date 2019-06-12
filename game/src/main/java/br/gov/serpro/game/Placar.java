package br.gov.serpro.game;

import java.util.ArrayList;
import java.util.List;

public class Placar {
	private Usuario usuario;
	private List<Ponto> pontos = new ArrayList<>();

	
	public Placar(Usuario usuario) {
		this.usuario = usuario;
	}

	public void registrarPonto(Usuario usuario, Ponto ponto) {
		this.usuario = usuario;
		this.pontos.add(ponto);
	}

	public List<Ponto> retornaPontos(Usuario usuario) {
		this.usuario = usuario;
		return this.pontos;
	}

}
