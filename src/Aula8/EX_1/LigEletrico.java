package Aula8.EX_1;

public class LigEletrico extends Ligeiro implements VeiculoEletrico{

    double aut;
    double percentagem;

    public LigEletrico(String marca, String modelo, int potencia, int nrQuadro, int bag, double percentagem, double aut) {
        super(marca, modelo, potencia, nrQuadro, bag);
        this.percentagem = percentagem;
        this.aut = aut;
    }


    @Override
    public double autonomia() {
        return aut;
    }

    @Override
    public void carregar(int percentagem){
        this.percentagem = percentagem;
        
        if(percentagem == 100){
            aut = 500;
        } else{
            aut = (percentagem*500)/100;
        }    
    }

    @Override
    public String toString(){
        return  "---Elétrico" .concat(super.toString()) + "Percentagem de carregamento: " + percentagem + ", Autonomia: " + aut + "\n" ;

    }
    
}
