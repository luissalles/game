package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteGame {

	@Test
	public void registrar10PontosEstrela() {
		List<Ponto> pontos = new ArrayList<>();
		Usuario usuario = new Usuario("Guerra");
		Placar placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 10));
		Ponto pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals(10, pontosUsuario.getQuantidadePontos());
	}
	
}
