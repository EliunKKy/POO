package Aula8.EX_1;

public class Pesado extends Veiculo {

    private int peso, nrQuadro;

    public Pesado(String marca, String modelo, int potencia, int nrQuadro, int peso){
        super(marca, modelo, potencia);
        this.nrQuadro = nrQuadro;
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getNrQuadro(){
        return nrQuadro;
    }

    public void setNrQuadro(int nrQuadro){
        this.nrQuadro = nrQuadro;
    }
}
