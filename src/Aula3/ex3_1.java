package Aula3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        float notaP, notaT, Final;
        final DecimalFormat df = new DecimalFormat("0");
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduza a nota Prática: ");
            notaP = sc.nextFloat();
            System.out.println("Introduza a nota Teórica: ");
            notaT = sc.nextFloat();
        } while((notaP < 0.0 || notaP >= 0.0) && (notaT <= 0.0 || notaT >= 20.0));
        
        if ( notaP < 7.0 || notaT < 7.0 ){
            System.out.println("66, reprovação por nota mínima");
        } else{
            Final = (float) (0.4*notaT + 0.6*notaP);
            assert Final >= 0 && Final <= 20;
            System.out.println("Nota final: " + df.format(Final));
        }

        sc.close();
    }
}
