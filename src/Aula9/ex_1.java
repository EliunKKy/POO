package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import Aula6.EX1.*;
import Aula7.EX2.*;

public class ex_1 {
    public static void main(String[] args) {

        // c1 -------------------------------------------

        System.out.println("\n---------------------------- c1 -------------------------------\n");

        ArrayList<Integer> c1= new ArrayList<>();
        for(int i= 10; i <= 100; i += 10) 
            c1.add(i);
        System.out.println("Size: "+ c1.size());

        for(int i = 0; i < c1.size(); i++) 
            System.out.println("Elemento #" + (i+1) + ": "+ c1.get(i));

        c1.removeIf(n -> (n < 50));  
        System.out.println(c1);  
           


        // c2 -------------------------------------------   
        
        System.out.println("\n---------------------------- c2 -------------------------------\n");
            
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println("List: " + c2);
        Collections.sort(c2);
        System.out.println("Sorted List: " + c2);
        c2.remove("Frio"); 
        c2.remove(0);
        System.out.println("List: " + c2);
        c2.add("Trevoada");
        System.out.println("The list contains «Nevoeiro»: " + c2.contains("Nevoeiro"));
        int a = c2.indexOf("Vento");
        System.out.println("INdex of «Vento»: " + a);
        int b = c2.lastIndexOf("Calor");
        System.out.println("Last index of «Calor»: " + b);
        c2.add(2, "Calor");
        System.out.println("List: " + c2);
        List<String> sub = c2.subList(1, 3);
        System.out.println("Sublist: " + sub);
        c2.set(1, "Frio");
        System.out.println("List: " + c2);

        // c3 -----------------------------------------------

        System.out.println("\n---------------------------- c3 -------------------------------\n");
        
        Set<Pessoa> c3 = new HashSet<>();

        
        Pessoa p1 = new Pessoa("Rodrigo", 55555, new Date(1, 4, 2000));
        Pessoa p2 = new Pessoa("Fábio", 44444, new Date(1, 4, 2000));
        Pessoa p3 = new Pessoa("Rafael", 66666, new Date(1, 4, 2000));
        Pessoa p4 = new Pessoa("Joaquim", 77777, new Date(1, 4, 2000));
        Pessoa p5 = new Pessoa("Mariana", 33333, new Date(1, 4, 2000));

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        c3.add(p2);

        Iterator<Pessoa> it = c3.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // c4 -------------------------------------------------------

        System.out.println("\n---------------------------- c4 -------------------------------\n");

        Set<DateND> c4= new TreeSet<>();

        c4.add(new DateND(1,2,2000));
        c4.add(new DateND(5,6,2022));
        c4.add(new DateND(7,11,1990));
        c4.add(new DateND(30,1,2004));
        c4.add(new DateND(1,2,2006));


        for(DateND d : c4)
            System.out.println(d);


    }
}
