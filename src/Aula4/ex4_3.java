package Aula4;

import java.util.Scanner;

public class ex4_3 {
    public static void main(String[] args){
        String acr = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");      

        for(int i=0; i < words.length; i++){
            if(words[i].length() >= 3){
                acr += words[i].charAt(0);
            } 
        }

        System.out.println("Acrónimo correspondente: " + acr);
        sc.close();

    }
}
