package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {

	@Test
	public void registrar10PontosEstrela() {
		Usuario usuario = new Usuario("Guerra");
		Placar placar = new Placar(usuario, new Pontos("Estrela", 0));
		placar.registrarPonto(usuario, new Pontos("Estrela", 10));
		int pontos = placar.RetornaPontos(usuario, "Estrela");
		assertEquals(10, pontos);
	}
}
