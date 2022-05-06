package Aula2;

import java.util.Scanner;

public class ex2_3 {
    public static void main(String[] args) {
		double M, fT, iT, Q;
		Scanner m = new Scanner(System.in);
        Scanner ti = new Scanner(System.in);
        Scanner tf = new Scanner(System.in);
        System.out.println("Massa de água: ");
        M = m.nextDouble();
        System.out.println("Temperatura inicial: ");
        iT = ti.nextDouble();
        System.out.println("Temperatura final: ");
        fT = tf.nextDouble();
        Q = M*(fT - iT)*4184;
        System.out.println("Energia necessária: " + Q + " Joules");
        m.close();
        ti.close();
        tf.close();
    }
}
