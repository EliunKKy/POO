package Aula2;

import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
		int T, h, m, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tempo em segundos: ");
        T = sc.nextInt();
        h = T/3600;
        m = (T%3600)/60;
        s = ((T%3600)%60)%60;
        System.out.println("Conversão: " + h + ":" + m + ":" + s);
        sc.close();
    }
}
