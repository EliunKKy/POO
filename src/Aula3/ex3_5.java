package Aula3;

import java.util.Scanner;

public class ex3_5 {
    public static void main(String[] args){
        double inv, tax;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tempo em meses: ");
        m = sc.nextInt();
        
        do{
            System.out.println("Insira o valor do investimento: ");
            inv = sc.nextDouble();
            System.out.println("Insira o valor da taxa em decimal: ");
            tax = sc.nextDouble();
        } while((inv < 0 || inv%1000 != 0) && (tax <= 0 || tax >= 0.05));
        
        for(int i=0; i<=m; i++){
            if(i == 0){
                System.out.println("valor: " + inv);
                System.out.println("Quantidade de meses: " + i);  
            } else{
                inv = inv + inv*tax;
                System.out.println("valor: " + inv);
                System.out.println("Quantidade de meses: " + i);
            }
        }

        sc.close();
    }
    
}
