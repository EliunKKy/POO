package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Iterator;
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
            String chr = String.valueOf(word.charAt(word.length() -1));
            if (chr.equals("s") || chr.equals("S")){
                s.add(word);
            }
        }

        // c)
        System.out.println("\n-----------------------------------------------------\n");
        for (String word : s) {
            System.out.print(word + "\n");
        }

        System.out.println("\n-----------------------------------------------------\n");
        for (String word : two) {
            System.out.print(word + "\n");
        }
        

        // d)
        Iterator<String> it = two.iterator();
        while(it.hasNext()){
            String i = it.next();
            for (int c = 0; c < i.length(); c++){
                if (!Character.isLetter(i.charAt(c))){ 
                    it.remove(); 
                    break;
                }
            }
        }
        
        
        System.out.println("\n-----------------------------------------------------\n");
        for (String word : two) {
            System.out.print(word + "\n");
        }
    }
        
}
