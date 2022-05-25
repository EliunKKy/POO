package Aula8.EX_1;

public class PesadoM extends Pesado{
    int maxC;

    public PesadoM(String marca, String modelo, int potencia, int nrQuadro, int peso, int maxC){
        super(marca, modelo, potencia, nrQuadro, peso);
        this.maxC = maxC;
    }

    public int getMaxC(){
        return maxC;
    }

    public void setMaxC(int maxC){
        this.maxC = maxC;
    }


    @Override
    public String toString(){
        return "--- Pesado de Mercadorias ---\n" .concat(super.toString()) + "Número máximo de carga = " + maxC + "\n";
    }
}
