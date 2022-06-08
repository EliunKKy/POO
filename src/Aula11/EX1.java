package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("words.txt"));
        Map<String, HashMap<String, Integer>> par = new HashMap<>();
        List<String> lst = new ArrayList<>();

        while(input.hasNext()){
            String word = input.next();
            
            if(word.length() > 2){
                lst.add(word);
            }
        }

        System.out.println(lst);

        String st = null;
        for (int i = 0; i < lst.size(); i++) {
            if(i == 0){ 
                st = lst.get(i);
                continue;
            }

            Map<String, String> oc = new HashMap<>();
            oc.put(lst(i), 1);
            par.put(st, oc);
                

            st = lst.get(i);
        }
        
        
        
    }
}
