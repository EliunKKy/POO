package Aula12;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException{
        Movies movies = new Movies();               // get constructor 

        // print titles
        for (String title : movies.titles("src/Aula12/movies.txt")) {  
            System.out.println(title);                
        }
        
    }
}
