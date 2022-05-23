package Aula8.EX_1;

public class Motociclo extends Veiculo{
    String tipo;

    public Motociclo(String modelo, String marca, int potencia, String tipo){
        super( marca, modelo, potencia);
        this.tipo = tipo;
    }

    // getters & setters 
   
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    //---------------------------------------

    @Override
    public String toString(){
        return "\nMotociclo -\n \tTipo = " + tipo + ",".concat(super.toString());
    }
}
