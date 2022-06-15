package Aula12.EX2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    String file;
    
    // constructor 
    public void movies(String file){
        this.file = file;
    }

    // Setters && Getters
    public void setFile(String file){
        this.file = file;
    }

    public String getFile(){
        return file;
    }

    public ArrayList<String>  titles(String file) throws IOException{
        Scanner movie = new Scanner(new FileReader(file));            // read line
        ArrayList<String> titles = new ArrayList<>();                // ArrayList to store the movie's titles

        int c = 0;
        while(movie.hasNextLine()){

            String line = movie.nextLine();
            String[] words = line.trim().split("[\t]+");            // split the lines by the tabs
            if(c != 0) {titles.add(words[0]);}                 // add the first element (movie title) to the ArrayList
            c++;
        }

        return titles;
    }
}
