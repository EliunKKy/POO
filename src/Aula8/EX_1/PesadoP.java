package Aula8.EX_1;

public class PesadoP extends Pesado {
    int maxP;

    public PesadoP(String marca, String modelo, int potencia, int nrQuadro, int peso, int maxP){
        super(marca, modelo, potencia, nrQuadro, peso);
        this.maxP = maxP;
    }

    public int getMaxP(){
        return maxP;
    }

    public void setMaxP(int maxP){
        this.maxP = maxP;
    }

    @Override
    public String toString(){
        return "\nPesado de Passgeiros -\n \tNúmero máximo de passageiros = " + maxP + ",".concat(super.toString());
    }
}
