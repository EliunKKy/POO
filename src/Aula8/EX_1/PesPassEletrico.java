package Aula8.EX_1;

public class PesPassEletrico extends PesadoP implements VeiculoEletrico{

    double aut, percentagem;

    public PesPassEletrico(String marca, String modelo, int potencia, int nrQuadro, int peso, int maxP, double percentagem, double aut) {
        super(marca, modelo, potencia, nrQuadro, peso, maxP);
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
            aut = 200;
        } else{
            aut = (percentagem*200)/100;
        }    
    }

    @Override
    public String toString(){
        return  "---Elétrico" .concat(super.toString()) + "Percentagem de carregamento: " + percentagem + ", Autonomia: " + aut + "\n" ;

    }

    
}
