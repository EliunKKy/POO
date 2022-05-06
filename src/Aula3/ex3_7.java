package Aula3;

import java.util.Random;
import java.util.Scanner;

public class ex3_7 {
    public static void main(String[] args){
        int n, x, up, c;
        String resposta;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        do{
            up = 100;
            n = rand.nextInt(up);
            c = 0;
            do{
                System.out.println("Insira a sua tentativa: ");
                x = sc.nextInt();
                c += 1;
                if(x < n){
                    System.out.println("Número demaisado baixo!");
                } else if(x > n){
                    System.out.println("Número demaisado alto!");
                } else{
                    System.out.println("Acertou!");
                    System.out.println("Tentativas: " + c);
                }
            } while(x != n);

            System.out.println("Pretende continuar? Prima S");
            resposta = sc.next();

        }while(resposta.equals("S"));
        sc.close();
    }
    
}
    