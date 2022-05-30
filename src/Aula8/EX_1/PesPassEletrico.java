package Aula8.EX_1;

public class PesPassEletrico extends PesadoP implements VeiculoEletrico{

    Double aut, percentagem;

    public PesPassEletrico(String marca, String modelo, int potencia, int nrQuadro, int peso, int maxP) {
        super(marca, modelo, potencia, nrQuadro, peso, maxP);
    }

    @Override
    public double autonomia() {
        return aut;
    }

    @Override
    public void carregar(Double percentagem){
        this.percentagem = percentagem;
        
        if(percentagem == 100.0){
            aut = 200.0;
        } else{
            aut = (percentagem*200)/100;
        }    
    }

    @Override
    public String toString(){
        return  "--- Elétrico " .concat(super.toString()) + "Percentagem de carregamento: " + percentagem + "%, Autonomia: " + aut + "km\n" ;

    }

    
}
