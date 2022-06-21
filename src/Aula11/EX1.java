package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class EX1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("src/Aula11/major.txt"));
        Map<String, HashMap<String, Integer>> par = new HashMap<>();        
        List<String> lst = new ArrayList<>(); 
    
        // remove unwanted characters and adding words to ArrayList
        while(input.hasNextLine()){
            String line = input.nextLine();
            line = line.replaceAll("[\t\n.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"\']", "");
            String[] words = line.trim().split("[\s]+");

            for(int i = 0; i < words.length; i++){
                if (words[i].length() > 2){
                    lst.add(words[i]);
                }
            }
        }

        for(int i = 0; i < lst.size(); i++){

            if(i == 0) continue;

            HashMap<String, Integer> oc = new HashMap<>();   // create a hashmap to be a value
            String key = lst.get(i-1);
            String next = lst.get(i);

            if(!par.containsKey(key)){           // Add keys
                oc.put(next, 1);           
                par.put(key, oc);                 // add values                           
            } else{
                if(!par.get(key).containsKey(next)){     // add values to existing keys
                    par.get(key).put(next, 1);
                    par.put(key, par.get(key));
                } else{
                    par.get(key).put(next, par.get(key).get(next) + 1);   // changing values for existing keys
                    par.put(key, par.get(key));
                }
            }
            
        }

        // print result 
        for (String w : par.keySet()) {
            System.out.println(w + " = " + par.get(w));
        }
        
        
    }
}
