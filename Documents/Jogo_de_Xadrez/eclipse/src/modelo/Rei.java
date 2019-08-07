package modelo;

import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;

public class Rei extends Peca {

    public Rei (int cor){
            super(cor);
    }
    @Override

    public String getPecaIcone(){
        if(this.cor == Peca.BRANCA){
            return "r";
        }else{
            return "R";
        }
    }
}
