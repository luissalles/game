package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {

	@Test
	public void registrar10PontosEstrela() {
		Usuario usuario = new Usuario();
		Placar placar = new Placar(usuario);
		placar.registrarPonto("Estrela", 10);
		int pontos = placar.RetornaPontos("Estrela");
		assertEquals(10, pontos);
	}
}
