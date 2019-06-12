package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {

	@Test
	public void registrar10PontosEstrela() {
		Usuario usuario = new Usuario("Guerra");
		Ponto ponto = new Ponto("Estrela", 0);
		Placar placar = new Placar(usuario, ponto);
		placar.registrarPonto(usuario, new Ponto("Estrela", 10));
		int pontos = placar.retornaPontos(usuario, ponto);
		assertEquals(10, pontos);
	}
}
