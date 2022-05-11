package Aula5;

import java.util.Scanner;

public class Date {
    int day, month, year;
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

    // set date
    public void setDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
    }

    // write date
    public String writeDate(){
        String s_data = "Current date: " + Integer.toString(getYear()) + "-" + Integer.toString(getMonth()) + "-" + Integer.toString(getDay());
        return s_data;
    }

    // métodos get
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    // incremento e decremento
    public void increment(int day, int month, int year){
        int days = monthDays(month, year);
        if(day < days){
            this.day++;
        } else{
            if(month == 12){
                this.year ++;
                this.month = 1;
                this.day = 1;
            } else{
                this.month++;
                this.day = 1;
            }
        }

        System.out.println("Date incremented! \n");
    }

    public void decrement(int day, int month, int year){
        if(day == 1){
            if(month == 1){
                this.year--;
                this.month = 12;
                this.day = 31;
            } else{
                this.month--;
                this.day = monthDays(month, year);
            }
        } else{
            this.day--;
        }

        System.out.println("Date decremented! \n");
    }


    // validação do mês 
    public static Boolean validMonth(int month){
        boolean vm = false;

        if(month >= 1 || month <= 12){
            vm = true;
        }

        return vm;
    }

    // determinação do número de dias num mês
    public static int monthDays(int month, int year){
        int[] m1 = {1, 3, 5, 7, 8, 10, 12};
        int[] m2 = {4, 6, 9, 11};
        int days = 0;
        
        for(int i=0; i < m1.length; i++){
            if(month == m1[i]){
                days = 31;
            }
        }
        for(int i=0; i < m2.length; i++){
            if(month == m2[i]){
                days = 30;
            }
        }

        boolean b = leapYear(year);
        if(month == 2){
            if(b == true){
                days = 29;
            } else{
                days = 28;
            }
        }


        return days;
    }

    // verificação de ano bissexto
    public static boolean leapYear(int year){

        if(year % 4 == 0){
            if( year % 100 == 0){
                if ( year % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            } 
            else{
                return true;
            }
        } else {
            return false;
        }          
            
        
    }

    // validação de data
    public boolean valid(int year, int month, int day){
        boolean valid = true;

        if(day < 1 || day > 31 ){
            valid = false;
        }

        boolean vm = validMonth(month);
        if(vm == false){
            valid = false;
        }

        int days = monthDays(month, year);
        if(day < 1 || day > days){
            valid = false;
        }


        return valid;
    }

}
