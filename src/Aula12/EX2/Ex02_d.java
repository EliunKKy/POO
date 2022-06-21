package Aula12.EX2;

import java.util.*;
import java.io.*;


public class Ex02_d {
    public static void main(String[] args) {

        TreeSet<String> genreSet = new TreeSet<String>();


        try {
            Scanner inFile = new Scanner(new File("src/Aula12/Files/movies.txt"));

            if(inFile.hasNextLine()) { // Skip First Line
                inFile.nextLine();
            }

            while (inFile.hasNextLine()) {
                String[] words = inFile.nextLine().split("[\t]");
                genreSet.add(words[3]);
            }


            // Print by score
            
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃                             ┃");
            System.out.println("┃           Valores           ┃");
            System.out.println("┃                             ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            System.out.println("┃      Todos os géneros       ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            
            for (String genre : genreSet) {
                System.out.printf("┃          %-18s ┃\n", genre);
            }

            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            System.out.println("┃          Exiting...         ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            
        }

        catch(FileNotFoundException e) {
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃                             ┃");
            System.out.println("┃           ERRO!!            ┃");
            System.out.println("┃    ficheiro não existente   ┃");
            System.out.println("┃                             ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
            System.out.println("┃          Exiting...         ┃");
            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            System.exit(0);
        }
    
    
    }
}
