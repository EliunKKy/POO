package Aula12.EX2;

import java.util.*;
import java.io.*;

public class Ex02_b {
    public static void main(String[] args) {

        ArrayList<Movie> moviesArray = new ArrayList<Movie>();

        try {
            Scanner inFile = new Scanner(new File("src/Aula12/Files/movies.txt"));

            if(inFile.hasNextLine()) { // Skip First Line
                inFile.nextLine();
            }

 
            while (inFile.hasNextLine()) {
                String[] words = inFile.nextLine().split("[\t]");
                
                Movie tempM = new Movie(words[0], Double.parseDouble(words[1]), words[2], words[3], Integer.parseInt(words[4]));
                
                moviesArray.add(tempM);   
            }

            // Print a todos
            
            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
            System.out.println("┃                             ┃");
            System.out.println("┃           Valores           ┃");
            System.out.println("┃                             ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━┳━━━━━━━━━━┳━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━┓");
            System.out.println("┃            Nome             ┃   Score  ┃  Rating  ┃     Genre     ┃ Running Time  ┃");
            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━╋━━━━━━━━━━╋━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━━┫");
            

            for (Movie movie : moviesArray) {
                System.out.println(movie.toString());
            }

            System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━┻━━━━━━━━━━┻━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━━┛");
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
