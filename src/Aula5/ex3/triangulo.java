package Aula5.ex3;

public class triangulo {
    public double lado1, lado2, lado3;

    public void setLados( double l1, double l2, double l3){
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public static Boolean value(double raio){
        boolean valid = false;
        if(l1>0 && l2>0 && l3>0){
            valid = true;
        }
        return valid;
    }
}
