package Aula10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EX2 {
    public static void main(String args[]){
        LinkedHashMap<String, ArrayList<String>> s = new LinkedHashMap<>();

        s.put("branco", new ArrayList<>());
        s.put("preto", new ArrayList<>());
        s.put("azul", new ArrayList<>());
        s.put("verde", new ArrayList<>());
        s.put("amarelo", new ArrayList<>());


        // add array to "branco"
        s.get("branco").add("Cor da neve.");
        s.get("branco").add("Pálido");
        s.get("branco").add("Cor do leite.");

        // add array to "preto"
        s.get("preto").add("Cor da sombra.");
        s.get("preto").add("Cor do carvão.");
        s.get("preto").add("Escuro");

        //add array to "Azul"
        s.get("azul").add("Cor do mar.");
        s.get("azul").add("Cor do céu.");
        s.get("azul").add("Sangue Real.");
        
        //add array to "verde"
        s.get("verde").add("Cor da relva.");
        s.get("verde").add("Cor da copa das árvores.");
        s.get("verde").add("Musgo.");

        System.out.println("\n-----------------------------------------------------------\n");

        // remove "amarelo"
        s.remove("amarelo");
        System.out.println("Hashmap contains key «amarelo»: " + s.containsKey("amarelo"));
        System.out.println("\n-----------------------------------------------------------\n");
        
        
        // print key: value
        for (String key : s.keySet()) {
            System.out.println("Values of " + key.toString() + ": \n");
            for (String value : s.get(key)) {
                System.out.println(value);
            }
            System.out.println("\n-----------------------------------------------------------\n");
        }
        
        // print keys
        System.out.println("All Keys: \n");
        for (String key : s.keySet()) {
            System.out.println(key.toString());
        }

        System.out.println("\n-----------------------------------------------------------\n");

        // print values 
        System.out.println("All values: \n");
        for (String key : s.keySet()) {
            for (String value : s.get(key)) {
                System.out.println(value);
            }
        }
        System.out.println("\n-----------------------------------------------------------\n");
        
        // Random
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a Key: ");
        String k = sc.nextLine();

        while(!s.containsKey(k)){
            if (!s.containsKey(k)){
                System.out.println("Invalid Key! Insert again: ");
                k = sc.nextLine();
            }
        }

        do{
            System.out.println("Insert a Key: ");
            k = sc.nextLine();

            if(k == "sair"){
                break;
            }

            while(!s.containsKey(k)){
                if (!s.containsKey(k)){
                    System.out.println("Invalid Key! Insert again: ");
                    k = sc.nextLine();
                }
            }
            ArrayList<String> lst = s.get(k);
            EX2 random = new EX2();
            System.out.println(random.getRandomElement(lst));
        
        }while(k != "sair");
        
        sc.close();
    }

    public String getRandomElement(ArrayList<String> list){
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
