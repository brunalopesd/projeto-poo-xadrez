package modelo;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Casa;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Peca;
import br.sc.udesc.cct.dcc.tads.poo.tabuleiro.Tabuleiro;


public class Rainha extends Peca{
    public Rainha (int cor){
        super(cor);
    }
    @Override

    public String getPecaIcone(){
        if(this.cor == Peca.BRANCA){
            return "a";
        }else{
            return "A";
        }
    }
}
