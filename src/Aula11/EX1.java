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
        Scanner input = new Scanner(new FileReader("words.txt"));
        Map<String, HashMap<String, Integer>> par = new HashMap<>();
        Map<String, Integer> oc = new HashMap<>();
        List<String> lst = new ArrayList<>();

        while(input.hasNext()){
            String word = input.next();
            lst.add(word);
        }

        
    }
}
