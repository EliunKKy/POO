package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EX1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new FileReader("words.txt"));
        List<String> lst = new ArrayList<String>();           

    
        while(input.hasNext()){
            
            String word = input.next();
            if(word.length() > 2){
                lst.add(word);
            }
        }

        System.out.println(lst + "\n");

        for(int i = 0; i < lst.size(); i++){
            Map<String, Integer> oc = new HashMap<>();
            String key = lst.get(i);

            if(i == 0) continue;
            String s = key + lst.get(i-1);

            oc.put(key, 0);

            for (int n = 0; n < lst.size(); n++){

                if(n == 0) {continue;}
                String st = lst.get(n) + lst.get(n-1);

                if(st.equals(s)){
                    oc.put(key, oc.get(key) + 1);
                }
            }

            System.out.println(lst.get(i-1) + " = " + oc);
        }
        
        
    }
}
