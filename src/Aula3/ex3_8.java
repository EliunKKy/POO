package Aula3;


import java.util.Scanner;

public class ex3_8 {
    public static void main(String[] args) {
        float notaP, notaT, Final;
        Scanner sc = new Scanner(System.in);
        Double[][] turma = new Double[16][3];
        
        for(int i=0; i < turma.length; i++){
            System.out.println("Introduza a nota Prática: ");
            notaP = sc.nextFloat();
            System.out.println("Introduza a nota Teórica: ");
            notaT = sc.nextFloat();

            Final = (float) (0.4*notaT + 0.6*notaP);

            turma[i][0]=(double) Math.round(notaP);
            turma[i][1]=(double) Math.round(notaT);
            turma[i][2]=(double) Math.round(Final);
        }
        System.out.printf("%10s \t %.10s \t %10s \n","notaT","notaP","notaF");
        for (int i=0;i<turma.length;i++) {
                System.out.printf("%10s \t %.10s \t %10s \n",turma[i][0],turma[i][1],turma[i][2]);
        }
        sc.close();
    }
}
