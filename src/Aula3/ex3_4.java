package Aula3;

import java.util.Scanner;



public class ex3_4 {
    public static void main(String[] args){
        double p, x, n, mx, mn, s, c, media;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        n = sc.nextDouble();
        p = x;
        mn = x;
        mx = x;
        s = x;
        c = 1;
        while (n != p){
            if(n > x){
                mx = n;
            }
            if(n < x){
                mn = n;
            }
            s += n;
            c += 1;
            x = n;
            n = sc.nextDouble();
        }
        media = s/c;
        System.out.println(mn);
        System.out.println(mx);
        System.out.println(media);
        sc.close();
    }    
}
