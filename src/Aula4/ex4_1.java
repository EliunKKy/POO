package Aula4;

public class ex4_1 {
    public static void main(String[] args){
        String s = "Hello world";
        System.out.println(s.toUpperCase()); // print uppercase

        // Caracter final
        int l = s.length();
        System.out.println(s.charAt(l-1));
        
        // Primeiros 3 caracteres
        for(int i=0; i<=2; i++){
            System.out.print(s.charAt(i) + ", ");
        }

        // Unicode de um caracter
        int cd = s.codePointAt(1);
        System.out.println("\n" + cd);

        // Append uma string no final de outra    
        String ponto = "!";
        System.out.println(s.concat(ponto));

        // Comparar strings
        String c1 = "Hello world";
        String c2 = "Hello earth";
        System.out.println(c1.compareTo(s));
        System.out.println(c2.compareTo(s));
    }
}
