package br.gov.serpro.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGame {
	private Usuario usuario;
	private Ponto pontosUsuario;
	private String nome;
	private Placar placar;
	private String tipoPonto;
	private int qtdePontos;
	
	@Test
	public void registrar10PontosEstrela() {
		usuario = new Usuario("Guerra");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 10));
		pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals(10, pontosUsuario.getQuantidadePontos());
	}
	
	@Test
	public void retornaPontosDeUmUsuario() {
		usuario = new Usuario("Guerra");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 25));
		placar.registrarPonto(usuario, new Ponto("Moeda", 20));
		nome = placar.getUsuario().getNome().toString();
		pontosUsuario = placar.retornaPontos(usuario).get(0);
		assertEquals("Guerra", nome);
		assertEquals("Estrela", pontosUsuario.getTipoPonto());
		assertEquals(25, pontosUsuario.getQuantidadePontos());
		pontosUsuario = placar.retornaPontos(usuario).get(1);
		assertEquals("Moeda", pontosUsuario.getTipoPonto());
		assertEquals(20, pontosUsuario.getQuantidadePontos());
	}
	
	@Test
	public void retornaRankingPorTipoDePonto() {
		usuario = new Usuario("Guerra");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 25));
		placar.registrarPonto(usuario, new Ponto("Moeda", 20));
		usuario = new Usuario("Fernandes");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 19));
		placar.registrarPonto(usuario, new Ponto("Moeda", 23));
		usuario = new Usuario("Rodrigo");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Estrela", 17));
		placar.registrarPonto(usuario, new Ponto("Moeda", 13));
		usuario = new Usuario("Claudio");
		placar = new Placar(usuario);
		placar.registrarPonto(usuario, new Ponto("Moeda", 13));
		nome = placar.getUsuario().getNome().toString();
		pontosUsuario = placar.retornaPontos(usuario).get(0);
		tipoPonto = pontosUsuario.getTipoPonto();
		qtdePontos = pontosUsuario.getQuantidadePontos();
		assertEquals("Guerra", nome);
		assertEquals("Estrela", tipoPonto);
		assertEquals(25, qtdePontos);
		nome = placar.getUsuario().getNome().toString();
		pontosUsuario = placar.retornaPontos(usuario).get(1);
		tipoPonto = pontosUsuario.getTipoPonto();
		qtdePontos = pontosUsuario.getQuantidadePontos();
		assertEquals("Fernandes", nome);
		assertEquals("Estrela", tipoPonto);
		assertEquals(19, qtdePontos);
		nome = placar.getUsuario().getNome().toString();
		pontosUsuario = placar.retornaPontos(usuario).get(2);
		tipoPonto = pontosUsuario.getTipoPonto();
		qtdePontos = pontosUsuario.getQuantidadePontos();
		assertEquals("Rodrigo", nome);
		assertEquals("Estrela", tipoPonto);
		assertEquals(17, qtdePontos);
	}
}
