package edu.faqi.ipsoo.gc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenisTest {

	@Test
	public void testInstanciacaoManoAMano() {
		//1 - atribuir valores
		Pessoa j1 = new Pessoa("Ze",13);
		Pessoa j2 = new Pessoa("Maria",14);
		//2 - acionar metodo
		Tenis tenis = new Tenis(j1, j2);
		boolean isDuplaDoObjeto =
			tenis.isDupla(); 
		//3 - Avaliar resultados
		assertTrue("Deveria ser ManoAMano"
				,isDuplaDoObjeto==false);
	}

	@Test
	public void testInstanciacaoDupla(){
		//1 - atribuir valores
		Pessoa j1 = new Pessoa("Ze",13);
		Pessoa j2 = new Pessoa("Maria",14);
		Pessoa j3 = new Pessoa("Pedro",13);
		Pessoa j4 = new Pessoa("Emengarda",14);
		//2 - acionar metodo
		Tenis tenis = new Tenis(j1, j2, j3, j4);
		boolean isDuplaDoObjeto =
			tenis.isDupla(); 
		//3 - Avaliar resultados - forcada
		assertTrue("Deveria ser Duplas"
				,isDuplaDoObjeto==true);
	}

	@Test
	public void testMostraPlacar(){
		//1 - Atribuir valores
		Pessoa j1 = new Pessoa("Ze",13);
		Pessoa j2 = new Pessoa("Maria",14);
		Tenis tenis = new Tenis(j1, j2);
		
		//2 - acionar metodo
		String placarDoObjeto = tenis.getPlacar();
		
		//3 - avaliar resultados
		assertTrue("O placar nao esta correto!",
			"00 x 00".equals(placarDoObjeto));
	}
}
