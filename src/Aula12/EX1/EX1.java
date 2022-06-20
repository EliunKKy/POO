package Aula12.EX1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("file.txt"));   //src/Aula12/file.txt
        List<String> lst = new ArrayList<>();  // words list
        List<String> dw = new ArrayList<>();    // diferent words only list
        int count = 0;
        int dif = 0;
    
        // remove unwanted characters and adding words to ArrayList
        while(input.hasNextLine()){
            String line = input.nextLine();
            line = line.replaceAll("[\t\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"\']", "");
            String[] words = line.trim().split("[\s]+");

            for(int i = 0; i < words.length; i++){
                lst.add(words[i]);
            }
        }

        for (int i = 0; i < lst.size(); i++) {
            count++;

            int occurrences = Collections.frequency(lst, lst.get(i));  // discover the repeated words using frequency method
            if(occurrences > 1){
                if(!dw.contains(lst.get(i))){
                    dw.add(lst.get(i));
                }
            } else{
                dif++;
            }
        }

        System.out.println("Número de palavras: " + count);
        System.out.println("Número de palavras diferentes: " + (dif + dw.size()));

        
    }    
}
