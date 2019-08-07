package principal;

//imports para as classes do jar "poo_tabuleiro"
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.DesenharTabuleiro;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.EstiloTabuleiro;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

import javafx.scene.PerspectiveCamera;
import modelo.*;

public class Main{
	public static void main(String[] args){
		
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		EstiloTabuleiro estilo = new EstiloTabuleiro();

		//cria as 8 pecas dos peoes
		Peca pb1 = new Peao(Peca.BRANCA);
		Peca pb2 = new Peao(Peca.BRANCA);
		Peca pb3 = new Peao(Peca.BRANCA);
		Peca pb4 = new Peao(Peca.BRANCA);
		Peca pb5 = new Peao(Peca.BRANCA);
		Peca pb6 = new Peao(Peca.BRANCA);
		Peca pb7 = new Peao(Peca.BRANCA);
		Peca pb8 = new Peao(Peca.BRANCA);


		// add os 8 peoes  BRANCOS no tabuleiro
		tabuleiro.addPeca(pb1, 1, 0);
		tabuleiro.addPeca(pb2, 1, 1);
		tabuleiro.addPeca(pb3, 1, 2);
		tabuleiro.addPeca(pb4, 1, 3);
		tabuleiro.addPeca(pb5, 1, 4);
		tabuleiro.addPeca(pb6, 1, 5);
		tabuleiro.addPeca(pb7, 1, 6);
		tabuleiro.addPeca(pb8, 1, 7);

		// cria as 2 torres
		Peca tb1 = new Torre(Peca.BRANCA);
		Peca tb2 = new Torre(Peca.BRANCA);


		//add  as TORRES no tabulerio
		tabuleiro.addPeca(tb1, 0, 0);
		tabuleiro.addPeca(tb2, 3, 5);


		//cria as 8 pecas dos PEOES
		Peca pp1 = new Peao(Peca.PRETA);
		Peca pp2 = new Peao(Peca.PRETA);
		Peca pp3 = new Peao(Peca.PRETA);
		Peca pp4 = new Peao(Peca.PRETA);
		Peca pp5 = new Peao(Peca.PRETA);
		Peca pp6 = new Peao(Peca.PRETA);
		Peca pp7 = new Peao(Peca.PRETA);
		Peca pp8 = new Peao(Peca.PRETA);


		// add  no tabuleiro  os peoes
		tabuleiro.addPeca(pp1, 6, 0);
		tabuleiro.addPeca(pp2, 6, 1);
		tabuleiro.addPeca(pp3, 6, 2);
		tabuleiro.addPeca(pp4, 6, 3);
		tabuleiro.addPeca(pp5, 6, 4);
		tabuleiro.addPeca(pp6, 6, 5);
		tabuleiro.addPeca(pp7, 6, 6);
		tabuleiro.addPeca(pp8, 6, 7);


		//cria as torres pretas
		Peca tp1 = new Torre(Peca.PRETA);
		Peca tp2 = new Torre(Peca.PRETA);

		tabuleiro.addPeca(tp1, 7, 0);
		tabuleiro.addPeca(tp2, 7, 7);

		//Cria as peças cavalo
		Peca cp1 = new Cavalo(Peca.PRETA);
		Peca cp2 = new Cavalo(Peca.PRETA);

		tabuleiro.addPeca(cp1, 7, 1);
		tabuleiro.addPeca(cp2, 7, 6);

		// cria os cavalos BRANCOS
		Peca cb1 = new Cavalo(Peca.BRANCA);
		Peca cb2 = new Cavalo(Peca.BRANCA);

		tabuleiro.addPeca(cb1, 0, 6);
		tabuleiro.addPeca(cb2, 0, 1);

		//cria e add os BISPOS
		Peca bb1 = new Bispos (Peca.BRANCA);
		Peca bb2 = new Bispos (Peca.BRANCA);

		tabuleiro.addPeca(bb1, 0, 2);
		tabuleiro.addPeca(bb2, 0, 5);

		Peca bp1 = new Bispos (Peca.PRETA);
		Peca bp2 = new Bispos (Peca.PRETA);

		tabuleiro.addPeca(bp1, 7, 2);
		tabuleiro.addPeca(bp2, 7, 5);

		//REI
		Peca rp1 = new Rei(Peca.PRETA);
		tabuleiro.addPeca(rp1, 7, 3);

		Peca rb1 = new Rei (Peca.BRANCA);
		tabuleiro.addPeca(rb1, 0, 3);

		//RAINHA

		Peca rap1 = new Rainha(Peca.PRETA);
		tabuleiro.addPeca(rap1, 7, 4);


		Peca rab1 = new Rainha (Peca.BRANCA);
		tabuleiro.addPeca(rab1, 0, 4);



		//ADD PECAS PRETAS

		//tp1.selecionar();//torre preta
		//tp2.selecionar();
		//pp1.selecionar();
		//pp2.selecionar(); //peao preto
		//pp3.selecionar();
		//pp4.selecionar();
		//pp5.selecionar();
		//pp6.selecionar();
		//pp7.selecionar();
		//pp8.selecionar();

		//ADD PEOES BRANCOS
		//pb1.selecionar();
		//pb2.selecionar(); //peao branco
		//pb3.selecionar();
		//pb4.selecionar();
		//pb5.selecionar();
		//pb6.selecionar();
		//pb7.selecionar();
		//pb8.selecionar();
		//bp1.selecionar(); //bispo preto
		//cp2.selecionar();
		//bb1.selecionar();
		//bb2.selecionar();

		//tb1.selecionar();
		tb2.selecionar();
		//tp1.selecionar();


		
		tabuleiro.atualizar();
		
		//para este exercício, estas duas linhas não devem ser mexidas.
		DesenharTabuleiro saida = new DesenharTabuleiro();
		saida.desenhar(tabuleiro, estilo);
	}
}