package Aula8.EX_1;

import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        
        Empresa empresa = new Empresa();
        Veiculo[] veiculos = Empresa.listaVeiculos();

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
                    String dados = empresa.dados("North", "1450", "north@gmail.com\n");
                    System.out.println("-----------------------------------------------\n");
                    System.out.println(dados);
                    System.out.println("-----------------------------------------------\n");
                break;
                case 2:
                    System.out.println(empresa.toString());
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
            }
        }


        sc.close();
    }
}
