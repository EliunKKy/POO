package Aula8.EX_1;

import java.util.Scanner;

public class menu {
    public static void main(String[] args){

        // veiculos -------------------------------------------------------
        Veiculo[] veiculos = new Veiculo[7];
        veiculos[0] = new Motociclo( "Honda", "CBR 1000 RR", 217, "desportivo").setMatricula("00-AA-00");
        veiculos[1] = new Ligeiro("Audi", "A6", 326, 100, 250).setMatricula("00-BB-00");
        veiculos[2] = new Taxi("Volkswagen", "Beetle", 168, 201, 300, 405).setMatricula("00-FF-54");
        veiculos[3] = new PesadoP("Mercedes", "Citaro", 299 , 200, 1000, 50).setMatricula("00-00-CC");
        veiculos[4] = new PesadoM("Volvo", "FH", 540, 202, 3000, 500).setMatricula("90-EA-54");
        veiculos[5] = new LigEletrico("Tesla", "Model S", 1020, 202, 300).setMatricula("75-SK-20");
        veiculos[6] = new PesPassEletrico("Mercedes", "Citaro", 299 , 200, 1000, 50).setMatricula("00-00-CC");
        
        // empresa ---------------------------------------------------------
        Empresa emp = new Empresa("North", "1450", "north@gmail.com\n", veiculos);
        

        Scanner sc = new Scanner(System.in);
        int km, n;
        boolean sair = false;


        while(!sair){
            System.out.println("\n-----------------------------------------------");
            System.out.println("Menu:");
            System.out.println("1 - Dados da empresa");
            System.out.println("2 - Lista de veículos:");
            System.out.println("3 - Adicionar trajeto a um veículo:");
            System.out.println("4 - Veiculo com maior trajeto:");
            System.out.println("5 - Carregar veiculo elétrico: ");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------------\n");

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
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("Selecione o veiculo:");
                    System.out.println("1 - Motociclo");
                    System.out.println("2 - Ligeiro");
                    System.out.println("3 - Taxi");
                    System.out.println("4 - Pesado Mercadorias");
                    System.out.println("5 - Pesado Passageiros");
                    System.out.println("6 - Ligeiro Elétrico");
                    System.out.println("7 - Pesado Passageiros Elétrico");
                    System.out.println("-----------------------------------------------\n");

                    int x = sc.nextInt();

                    System.out.println("\nQuilómetros percorridos na 1ª viagem: ");
                    km = sc.nextInt();
                    int i = 2;

                    do{
                        System.out.println("Quilómetros percorridos na " + i++ + "ª viagem: ");
                        if(km != 0){
                            veiculos[x-1].trajeto(km);
                        }
                        km = sc.nextInt();
                    }while(km!=0);
                break;   
                case 4:
                    System.out.println("\n-----------------------------------------------\n");
                    System.out.println("Veiculo com maior trajeto :\t" + emp.CompararD() + "\n");
                    System.out.println("-----------------------------------------------\n");
                break;
                case 5:
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("Escolha o veiculo:");
                    System.out.println("5 - Ligeiro Elétrico");
                    System.out.println("6 - Pesado Passageiros Eletrico ");
                    System.out.println("-----------------------------------------------\n");
                    int s = sc.nextInt();

                    System.out.println("\n-----------------------------------------------");
                    System.out.println("Insira a percetagem de carregamento (0 a 100): ");
                    Double per = sc.nextDouble();

                    if(s == 5){
                        ((LigEletrico)veiculos[s]).carregar(per);
                    } else{
                        ((PesPassEletrico)veiculos[s]).carregar(per);
                    } 
                break;      
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }


        sc.close();
    }

    
}
