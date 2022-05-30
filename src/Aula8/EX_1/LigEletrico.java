package Aula8.EX_1;

public class LigEletrico extends Ligeiro implements VeiculoEletrico{

    Double aut;
    Double percentagem;

    public LigEletrico(String marca, String modelo, int potencia, int nrQuadro, int bag) {
        super(marca, modelo, potencia, nrQuadro, bag);
    }


    @Override
    public double autonomia() {
        return aut;
    }

    @Override
    public void carregar(Double percentagem){
        this.percentagem = percentagem;

        if(percentagem == 100.0){
            aut = 500.0;
        } else{
            aut = (percentagem*500.0)/100.0;
        }    
    }

    @Override
    public String toString(){
        return  "--- Elétrico " .concat(super.toString()) + ", Percentagem de carregamento: " + percentagem + "%, Autonomia: " + aut + "km\n" ;

    }

    
}
