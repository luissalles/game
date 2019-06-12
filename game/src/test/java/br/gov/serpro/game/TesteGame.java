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
	
	@Test
	public void retornaPontosDeUmUsuario() {
		List<Ponto> pontos = new ArrayList<>();
		Usuario usuario = new Usuario("Guerra");
		Placar placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 25));
		placar.registrarPonto(usuario, new Ponto("Moeda", 20));
		String nome = placar.getUsuario().getNome().toString();
		Ponto pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals("Guerra", nome);
		assertEquals("Estrela", pontosUsuario.getTipoPonto());
		assertEquals(25, pontosUsuario.getQuantidadePontos());
		Ponto pontosUsuario2 = placar.retornaPontos(usuario).get(1);
		assertEquals("Moeda", pontosUsuario2.getTipoPonto());
		assertEquals(20, pontosUsuario2.getQuantidadePontos());
	}

}
