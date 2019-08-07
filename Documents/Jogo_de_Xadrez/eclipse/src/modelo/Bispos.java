package modelo;
import java.util.ArrayList;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

public class Bispos extends Peca {

    //se movimenta somente nas diagonais do tabuleiro.

    public Bispos (int cor){
        super(cor);
    }
    @Override

    public String getPecaIcone(){
        if(this.cor == Peca.BRANCA){
            return "b";
        }else{
            return "B";
        }
    }
    public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro) {

        ArrayList<Casa> casas = new ArrayList<Casa>();

        int largura = this.getLargura();
        int altura = this.getAltura();
        int cor = this.getCor();

        int cima = altura - 1;
        int ladoEsquerdo = largura - 1;
        int ladoDireito = largura + 1;

        if (cor == PRETA) {
            while (cima >= 0 && ladoEsquerdo >= 0) {
                Casa c2 = tabuleiro.getCasaNaPosicao(cima, ladoEsquerdo);

                casas.add(c2);
                cima--;
                ladoEsquerdo--;
            }

            cima = altura - 1;

            while (cima > -1 && ladoDireito < tabuleiro.getLargura()) {
                Casa c1 = tabuleiro.getCasaNaPosicao(cima, ladoDireito);

                casas.add(c1);
                cima--;
                ladoDireito++;
            }

            casas.add(this.casa);

            return casas;
        }

        else{

            cima = altura +1;

            while (cima > 0 && ladoEsquerdo >= 0) {
                Casa c2 = tabuleiro.getCasaNaPosicao(cima, ladoEsquerdo);

                casas.add(c2);
                cima++;
                ladoEsquerdo--;
            }

            cima = altura +1;

            while (cima > 0 && ladoDireito < tabuleiro.getLargura()) {
                Casa c1 = tabuleiro.getCasaNaPosicao(cima, ladoDireito);

                casas.add(c1);
                cima++;
                ladoDireito++;
            }

            casas.add(this.casa);

            return casas;

        }
    }
}
