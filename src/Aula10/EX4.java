package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("List.txt"));
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();

        // print
        while (input.hasNext()) {
            String word = input.nextLine();
            System.out.println(word);

            // b)
            if (word.length() > 2){    
                two.add(word);
            }
            
            // c)
            char c = word.charAt(word.length() -1);
            String chr = String.valueOf(c);
            if (chr == "s" || chr == "S"){
                s.add(word);
            }
        }


        System.out.println("\n-----------------------------------------------------\n");
        System.out.println(s);

        for (String w : s) {
            System.out.println(w);
        }
        
    }
        
}
