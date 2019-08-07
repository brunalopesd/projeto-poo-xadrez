package br.sc.udesc.cct.dcc.tads.poo.tabuleiro;

public class DesenharTabuleiro {

	public void desenhar(Tabuleiro tab, EstiloTabuleiro est){
		est.setTabuleiro(tab);
		est.processar();
		String s = est.desenhar();
		System.out.println(s);
	}
}
