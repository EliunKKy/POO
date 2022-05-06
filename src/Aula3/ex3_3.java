package Aula3;

import java.util.Scanner;

public class ex3_3 {
    public static void main(String[] args){
        int n;
        int div = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        n = sc.nextInt();
        while(n <= 0){
            System.out.println("O número não é válido! Insira um número superior a zero.");
            n = sc.nextInt();
        }

        for(int i=2; i <= n-1; i++){
            if( n%i == 0){
                div++;
            }
        }

        if(div != 0){
            System.out.println("O número não é primo!");
        }
        else{
            System.out.println("O número é primo!");
        } 
        sc.close();  
    }
}
