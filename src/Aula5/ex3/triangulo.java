package Aula5.ex3;

public class triangulo {
    public double lado1, lado2, lado3;

    public void setLados( double l1, double l2, double l3){
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    public static Boolean values(double lado1, double lado2, double lado3){
        boolean valid = false;
		if((lado1+lado2 > lado3)&&(lado1+lado3 > lado2)&&(lado2+lado3 > lado1)){
			valid = true;
		}
		return valid;
    }

    public double perimetro () {
		return lado1 + lado2 + lado3;
	}
	
	public double area() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s-lado1) * (s-lado2) * (s-lado3));
	}
}
