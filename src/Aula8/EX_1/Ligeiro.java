package Aula8.EX_1;

public class Ligeiro extends Veiculo{
    private int nrQuadro, bag;

    public Ligeiro( String marca, String modelo, int potencia, int nrQuadro, int bag) {
        super(marca, modelo, potencia);
        this.nrQuadro = nrQuadro;
        this.bag = bag;
    }

    public int getNrQuadro(){
        return nrQuadro;
    }

    public void setNrQuadro(int nrQuadro){
        this.nrQuadro = nrQuadro;
    }

    public int getBag(){
        return bag;
    }

    public void setBag(int bag){
        this.bag = bag;
    }

    @Override
    public String toString(){
        return  "\nAutomóvel ligeiro:\n" + super.toString() + "\tNúmero de quadro = " + nrQuadro + ", Capaciade de bagagem = " + bag;
    }

    
}
