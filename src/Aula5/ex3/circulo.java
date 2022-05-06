package Aula5.ex3;

public class circulo {
    public double raio;

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public static Boolean value(double raio){
        boolean valid = false;
        if(raio>0){
            valid = true;
        }
        return valid;
    }
    
    public String toString() {
		if(Boolean.TRUE.equals(value(raio)))
            return String.format("Raio - %s", raio);
        else{
            return "Raio inválido!";
        }
    }

    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double perimetro () {
		return 2 * Math.PI * raio;
	}



}
