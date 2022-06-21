package Aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EX2 {
    public static void main(String[] args) throws IOException{
        Scanner scVoo = new Scanner(new FileReader("src/Aula11/voos.txt"));
        Scanner comp = new Scanner(new FileReader("src/Aula11/companhias.txt"));
        List<String> voo = new ArrayList<>();
        List<String> info = new ArrayList<>();

        int a = 0;
        while(scVoo.hasNextLine()){
            if(a == 0){
                continue;
            }

            voo.add(scVoo.nextLine());
            a++;
        }

        int b = 0;
        while(comp.hasNextLine()){
            if(b == 0){
                continue;
            }

            info.add(comp.nextLine());
            b++;
        }

        System.out.print(voo);
        
    }    
}
