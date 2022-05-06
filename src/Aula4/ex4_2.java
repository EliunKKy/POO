package Aula4;

import java.util.Scanner;


public class ex4_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        String s = sc.nextLine();
        System.out.println("Quantidade de dígitos: " + countDigits(s));
        System.out.println("Quantidade de espaços: " + countSpaces(s));
        countUpper(s);
        System.out.println("Sequêcias de espaços removidas: " + spaceSequence(s));
        palindromo(s);
        // System.out.println("Quantidade de maiúsculas: " + countUpper(s));
        sc.close();
    }    
        
    static int countDigits(String s){
        int count = 0;

        for(int i=0; i < s.length(); i++){
            char x = s.charAt(i);
            if(Character.isDigit(x)){
                count ++;
            }
        }
        return count;
    }  
    
    static int countSpaces(String s){
        int count = 0;

        for(char x : s.toCharArray()){
            if(x == ' '){
                count ++;
            }
        }
        return count;
    } 

    static void countUpper(String s){
        int count = 0;

        for(int i=0; i < s.length(); i++){
            char x = s.charAt(i);
            if(Character.isLowerCase(x)){
                count ++;
            }
        }
        if(count == s.length()){
            System.out.println("Só tem minúsculas! ");
        } else{
            System.out.println("Não tem só minúsculas! ");
        }
    } 
    
    static String spaceSequence(String s){
        String x = s.replace("  ", " ");
        return x;
    }

    static void palindromo(String s){
        String palindromo = "";
    		
        for(int i = s.length() - 1; i >= 0; i--){
            
            palindromo += s.charAt(i);

        }
        
        if(palindromo.equals(s)) {
            System.out.print("É um palíndromo!");
        }
        else {
            System.out.print("Não é um palíndromo!");
            
        }
    }
}      
