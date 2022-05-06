package Aula3;

import java.util.Scanner;

public class ex3_6 {
    public static void main(String[] args){
        int y, m;
        int[] m1 = {1, 3, 5, 7, 8, 10, 12};
        int[] m2 = {4, 6, 9, 11};

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o ano: ");
        y = sc.nextInt();
        do{
            System.out.println("Insira o mês: ");
            m = sc.nextInt();
        } while(m <= 0 && m >= 12);  
        
        int b = 0;
        if(y%4 == 0){
            b = 1;
        }
        
        for(int i=0; i < m1.length; i++){
            if(m == m1[i]){
                System.out.println("Este mes tem 31 dias!");
            }
        }
        for(int i=0; i < m2.length; i++){
            if(m == m2[i]){
                System.out.println("Este mes tem 30 dias!");
            }
        }

        
        if(m == 2){
            if(b == 1){
                System.out.println("Este mes tem 29 dias!");
            } else{
                System.out.println("Este mes tem 28 dias!");
            }
        }

        sc.close();
    }
}
