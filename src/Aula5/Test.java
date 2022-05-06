package Aula5;

import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        Date data = new Date();
        while(true){
            System.out.println("\n-----------------\n");             
            System.out.println("1 - create new date");             
            System.out.println("2 - show current date");            
            System.out.println("3 - increment date");             
            System.out.println("4 - decrement date");               
            System.out.println("0 - exit\n ");
    
            int choice = sc.nextInt();
            
            if(choice == 0){
                break;
            } else if(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.println("Insira uma opção válida!");
            } else{
                switch(choice){
    
                    case 1:
                        while(true){
                            System.out.println("Insert a day: ");
                            final int day = sc.nextInt();
                            System.out.println("Insert a month: ");
                            final int month = sc.nextInt();
                            System.out.println("Insert a year: ");
                            final int year = sc.nextInt();
    
                            if(data.valid(year, month, day)){
                                data.setDate(day, month, year);
                                break;
                            }
                        }
                        break;
    
                    case 2:
                        System.out.println(data.writeDate());
                        break;
    
                    case 3:
                        data.increment(data.year, data.month, data.day);
                        break;
                    
                    case 4:
                        data.decrement(data.day, data.month, data.year);
                        break;    
    
                }
            }
        }
        sc.close();
    }
}
   