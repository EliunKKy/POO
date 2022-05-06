package Aula2;

import java.util.Scanner;
import java.lang.Math;

public class ex2_8 {
    public static void main(String[] args) {
		double A, B, C, ang, sin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Comprimento do cateto A: ");
        A = sc.nextInt();
        System.out.println("Comprimento do cateto B: ");
        B = sc.nextInt();
        C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        sin = B/C;
        ang = Math.toDegrees(sin);
        System.out.println("Hipotenusa: " + C);
        System.out.println("Angulo: " + ang);
        sc.close();
    }
}
