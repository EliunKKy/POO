package Aula2;

import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args) {
		double v1, d1, v2, d2, t1, t2, T, V;
		Scanner sc = new Scanner(System.in);
        System.out.println("Velocidade do primeiro trajeto: ");
        v1 = sc.nextDouble();
        System.out.println("Distancia do primeiro trajeto: ");
        d1 = sc.nextDouble();
        System.out.println("Velocidade do segundo trajeto: ");
        v2 = sc.nextDouble();
        System.out.println("Distancia do primeiro trajeto: ");
        d2 = sc.nextDouble();
        t1 = d1/v1;
        t2 = d2/v2;
        T = t1+t2;
        V = (d1+d2)/T;
        System.out.println( "Velocidade média " + V);
        sc.close();
    }
}
