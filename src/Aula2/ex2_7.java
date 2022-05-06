package Aula2;

import java.util.Scanner;
import java.lang.Math;

public class ex2_7 {
    public static void main(String[] args) {
		double x1, x2, y1, y2, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordenada x1: ");
        x1 = sc.nextInt();
        System.out.println("Coordenada y1: ");
        y1 = sc.nextInt();
        System.out.println("Coordenada x2: ");
        x2 = sc.nextInt();
        System.out.println("Coordenada y2: ");
        y2 = sc.nextInt();
        D = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Distancia entre os dois pontos: " + D);
        sc.close();
    }
}
