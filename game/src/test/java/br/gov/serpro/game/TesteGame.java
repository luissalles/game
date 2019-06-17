package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {
	private Usuario usuario;
	private Ponto pontosUsuario;
	
	@Test
	public void registrar10PontosEstrela() {
		usuario = new Usuario("Guerra");
		Placar placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 10));
		pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals(10, pontosUsuario.getQuantidadePontos());
	}
	
	@Test
	public void retornaPontosDeUmUsuario() {
		usuario = new Usuario("Guerra");
		Placar placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 25));
		placar.registrarPonto(usuario, new Ponto("Moeda", 20));
		String nome = placar.getUsuario().getNome().toString();
		pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals("Guerra", nome);
		assertEquals("Estrela", pontosUsuario.getTipoPonto());
		assertEquals(25, pontosUsuario.getQuantidadePontos());
		pontosUsuario = placar.retornaPontos(usuario).get(1);
		assertEquals("Moeda", pontosUsuario.getTipoPonto());
		assertEquals(20, pontosUsuario.getQuantidadePontos());
	}
	
}
