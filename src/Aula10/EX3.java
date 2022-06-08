package Aula10;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class EX3 {

    public static void main (String args[]){
        Map<Character, ArrayList<Integer>> lst = new HashMap<>();
        String s = "Hello world!";

        for (int i = 0; i < s.length(); i++) {
            ArrayList<Integer> I = new ArrayList<>();
            char chr = (s.charAt(i));

            if(!lst.containsKey(chr)){
                I.add(i);
                lst.put(chr, I);
            } else{
                lst.get(chr).add(i);
            }
        }

        System.out.printf("%10s  %3s  %.10s  \n","Char", "|", "Position");
        for (Character c : lst.keySet()) {
            System.out.printf("%8s  %5s  %.50s \n", c, "|", lst.get(c));
        }
    }
}
