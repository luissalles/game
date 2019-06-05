package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {

	@Test
	public void registrar10PontosEstrela() {
		Usuario usuario = new Usuario("Guerra");
		Pontos ponto = new Pontos("Estrela", 0);
		Placar placar = new Placar(usuario, ponto);
		placar.registrarPonto(usuario, new Pontos("Estrela", 10));
		int pontos = placar.RetornaPontos(usuario, ponto);
		assertEquals(10, pontos);
	}
}
