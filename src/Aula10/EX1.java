package Aula10;

import java.util.HashMap;
import java.util.Map;

public class EX1 {
    public static void main(String args[]){
        Map<String, String> s = new HashMap<>();
        s.put("branco", "Que tem cor da neve.");
        s.put("preto", "Que tem cor da sombra.");
        s.put("Azul", "Que tem cor do mar.");
        s.put("verde", "Que tem cor da relva.");
        s.put("amarelo", "Que tem cor do Sol.");
        System.out.println("Key «amarelo» : " + s.get("amarelo") + "\n");

        s.replace("amarelo", "Que tem cor do Sol.", "Que term cor das estrelas.");
        System.out.println("Replaced key «amarelo»: " + s.get("amarelo") + "\n");
        
        s.remove("verde");
        System.out.println("Hashmap contains key «verde»: " + s.containsKey("verde"));
        System.out.println("\n-----------------------------------------------------------\n");

        
        // print key: value
        for (String key : s.keySet()) {
            System.out.println(key.toString() + ": " + s.get(key).toString());
        }
        
        System.out.println("\n-----------------------------------------------------------\n");

        // print keys
        for (String key : s.keySet()) {
            System.out.println(key.toString());
        }

        System.out.println("\n-----------------------------------------------------------\n");

        // print values 
        for (String key : s.keySet()) {
            System.out.println(s.get(key));
        }
        
    }
}
