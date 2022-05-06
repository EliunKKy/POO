package Aula2;

import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
		double C, F;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a temperatura em C: ");
		C = sc.nextDouble();
		F = 1.8*C + 32;
		System.out.println("A temperatura em Fahrenheit é " + F);
		sc.close();
	}
}
