package Aula2;

import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
		double I, tax, J; 
        int month;
		Scanner in = new Scanner(System.in);
        Scanner tx = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        System.out.println("Valor do investimento: ");
        I = in.nextDouble();
        System.out.println("Taxa mensal: ");
        tax = tx.nextDouble();
        System.out.println("Meses concluidos desde o investimento: ");
        month = m.nextInt();
        for(int i=1; i<=month; i++){
            J = (I*tax)/100;
            I += J;
        }
        System.out.println( "Valor total ao fim de " + month + " meses: " + I + "€");
        m.close();
        in.close();
        tx.close();
    }
}
