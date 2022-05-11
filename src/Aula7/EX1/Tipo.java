package Aula7.EX1;

public abstract class Tipo {
    public String cor;

    public abstract double area();
    public abstract double perimetro();

    public static void setcor(String cor) {
    }

    public String getCor() {
        return cor;
    }

    public static String print(String cor) {
        return String.format("Cor - %s", cor);
    }   
}
