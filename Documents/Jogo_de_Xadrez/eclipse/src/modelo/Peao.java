package modelo;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

import java.util.ArrayList;

public class Peao extends Peca{

	public Peao(int cor){
		super(cor);
	}

	@Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro) {

		ArrayList<Casa> casas = new ArrayList<Casa>();

		int largura = this.getLargura();
		int altura = this.getAltura();
		int cor = this.getCor();

		int cima = altura;


		if(cor==PRETA){
		while (cima > altura-3) {
			Casa c = tabuleiro.getCasaNaPosicao(cima, largura);

			casas.add(c);
			cima--;
		}

		casas.add(this.casa);
		return casas;
	}
		else {
			while (cima < altura+3) {
				Casa c = tabuleiro.getCasaNaPosicao(cima, largura);

				casas.add(c);
				cima++;
			}

			casas.add(this.casa);
			return casas;
		}

	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "p";
		}else{
			return "P";
		}
	}
}