package modelo;
import java.util.ArrayList;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

public class Torre extends Peca{

	public Torre(int cor){
		super(cor);
	}


	@Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro) {

		ArrayList<Casa> casas = new ArrayList<Casa>();

		int largura = this.getLargura();
		int altura = this.getAltura();
		int cor = this.getCor();

		int cima = altura-1;
		int lado = largura - 1;

			while (cima > -1) {
				Casa c = tabuleiro.getCasaNaPosicao(cima, largura);
				if(c.temPeca()){
					if(c.getPeca().temMesmaCor(this.getCasa().getPeca())) {
						cima = -1; //condicao de parada;
					}
					else{
						cima = -1;
						casas.add(c);

					}
				}
				else{
					casas.add(c);
					cima--;
				}
		}
		cima = altura+1;

		while (cima < 8) {
			Casa c1 = tabuleiro.getCasaNaPosicao(cima, largura);
			if(c1.temPeca()){
				if(c1.getPeca().temMesmaCor(this.getCasa().getPeca())){
					cima=8; //condicao pra sair do while;
				}
				else{
					cima=8;
					casas.add(c1);
				}
			}
			else {
				casas.add(c1);
				cima++;
			}
		}

		// movimentos para o lado
		while (lado > -1) {
			Casa c = tabuleiro.getCasaNaPosicao(altura, lado);
			if(c.temPeca()){
				if(c.getPeca().temMesmaCor(this.getCasa().getPeca())){
					lado=-1;
				}
				else{
					lado=-1;
					casas.add(c);
				}
			}
			else{
				casas.add(c);
				lado--;
			}
		}
		lado = largura+1;

		while (lado < 8) {
			Casa c1 = tabuleiro.getCasaNaPosicao(altura, lado);
			if(c1.temPeca()){
				if(c1.getPeca().temMesmaCor(this.getCasa().getPeca())){
					lado=8;
				}
				else{
					lado=8;
					casas.add(c1);
				}
			}
			else {
				casas.add(c1);
				lado++;
			}
		}

		casas.add(this.casa);
		return casas;
	}
	@Override
	public String getPecaIcone() {
		if (this.cor == Peca.BRANCA) {
			return "t";
		} else {
			return "T";
		}
	}
	}