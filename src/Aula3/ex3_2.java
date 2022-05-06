package Aula3;

import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        int N, n;
        System.out.println("Introduza um número: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        assert N > 0; 
        n = N-1;
        for(int i = N; i > 0; i--){
            System.out.println(n);
            n --;   
        }
        sc.close();
    }

}
