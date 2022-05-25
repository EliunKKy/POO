package Aula8.EX_1;

import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        // veiculos --------------------------------------------------
        Veiculo[] veiculos = new Veiculo[5];
        veiculos[0] = new Motociclo( "Honda", "CBR 1000 RR", 217, "desportivo").setMatricula("00-AA-00");
        veiculos[1] = new Ligeiro("Audi", "A6", 326, 100, 250).setMatricula("00-BB-00");
        veiculos[2] = new Taxi("Volkswagen", "Beetle", 168, 201, 300, 405).setMatricula("00-FF-54");
        veiculos[3] = new PesadoP("Mercedes", "Citaro", 299 , 200, 1000, 50).setMatricula("00-00-CC");
        veiculos[4] = new PesadoM("Volvo", "FH", 540, 202, 3000, 500).setMatricula("90-EA-54");

        // empresa ---------------------------------------------------------
        Empresa emp = new Empresa("North", "1450", "north@gmail.com\n", veiculos);
        

        Scanner sc = new Scanner(System.in);
        int km, n;
        boolean sair = false;


        while(!sair){
            System.out.println("Menu:");
            System.out.println("1 - Dados da empresa");
            System.out.println("2 - Lista de veículos:");
            System.out.println("3 - Adicionar trajeto a um veículo:");
            System.out.println("4 - Veiculo com maior trajeto:");
            System.out.println("0 - Sair");

            n = sc.nextInt();
            switch(n){
                case 0:
                    sair = true;
                break;
                case 1:
                    System.out.println("-----------------------------------------------\n");
                    System.out.println(emp.toString());
                    System.out.println("-----------------------------------------------\n");
                break;
                case 2:
                    System.out.println(emp.printVeiculos());
                break;
                case 3:
                    System.out.println("Selecione o veiculo:");
                    System.out.println("1 - Motociclo");
                    System.out.println("2 - Ligeiro");
                    System.out.println("3 - Taxi");
                    System.out.println("4 - Pesado Mercadorias");
                    System.out.println("5 - Pesado Passageiros");
                    int x = sc.nextInt();

                    System.out.println("Quilómetros percorridos na 1ª viagem: ");
                    km = sc.nextInt();
                    int i = 2;

                    do{
                        System.out.println("Quilómetros percorridos na " + i++ + "ª viagem: ");
                        km = sc.nextInt();
                        if(km != 0){
                            veiculos[x-1].trajeto(km);
                        }
                    }while(km!=0);
                break;   
                case 4:
                    System.out.println("-----------------------------------------------\n");
                    System.out.println(emp.CompararD());
                    System.out.println("-----------------------------------------------\n");
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }


        sc.close();
    }

    
}
