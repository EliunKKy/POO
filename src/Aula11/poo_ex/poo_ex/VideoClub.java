package Aula11.poo_ex.poo_ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VideoClub {
    String movies;
    Map<Person, ArrayList<Scanner>> random = new HashMap<>();


    public VideoClub(String movies) {
        this.movies = movies;
    }

    
    public void setLines(String movies) {
        this.movies = movies;
    }


    public String getLines() {
        return movies;
    }
    

    public void listRentals() throws FileNotFoundException {

        // for (Person p : random) {
        //     System.out.println(random(p).toString() + random.get(p));
        // }

    }


    public void randomRental(Person person) throws FileNotFoundException {
        Scanner input = new Scanner(new File(movies));
        ArrayList<Scanner> lst = new ArrayList<>();

        if(!random.containsKey(person)){
            lst.add(input);
            random.put(person, lst);
        } else{
            random.get(person).add(input);
        }
    }

}
