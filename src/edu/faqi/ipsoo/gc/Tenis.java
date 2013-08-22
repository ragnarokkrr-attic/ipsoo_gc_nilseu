package edu.faqi.ipsoo.gc;

public class Tenis {
	private Pessoa jogador1;
	private Pessoa jogador2;
	private Pessoa jogador3;
	private Pessoa jogador4;
	
	private int pontuacaoLado1;
	private int pontuacaoLado2;

	private boolean dupla;
	
	public Tenis(Pessoa j1, Pessoa j2){
		this.jogador1 = j1;
		this.jogador2 = j2;
		this.pontuacaoLado1 = 0;
		this.pontuacaoLado2 = 0;
		this.dupla = false;
	}
	
	public Tenis(Pessoa j1, Pessoa j2
			,Pessoa j3, Pessoa j4){
		this(j1, j2);
		this.jogador3 = j3;
		this.jogador4 = j4;
		this.dupla = true;
	}
	
	public boolean isDupla(){
		return this.dupla;
	}
	
	
	
	
}
