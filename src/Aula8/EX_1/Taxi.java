package Aula8.EX_1;

public class Taxi extends Ligeiro{
    
    private int lic;

    public Taxi(String marca, String modelo, int potencia, int nrQuadro, int bag, int lic){
        super(marca, modelo, potencia, nrQuadro, bag);
        this.lic = lic;
    }

    //setters & getters

    public int getLic(){
        return lic;
    }

    public void setLic(int lic){
        this.lic = lic;
    }

    @Override
    public String toString(){
        return "\nTaxi -\n \tNúmero licença = " + lic + ",".concat(super.toString());
    }
}
