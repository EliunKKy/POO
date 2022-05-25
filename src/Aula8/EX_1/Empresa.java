package Aula8.EX_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empresa {
    private String nome, zip, email;
    private Veiculo[] veiculos; 
   
    

    public Empresa(String nome, String zip, String email, Veiculo[] veiculos){
        this.nome = nome;
        this.zip = zip;
        this.email = email;
        this.veiculos = veiculos;
    }

    // comparar distâncias ------------------------------------

    public String[] CompararD(){
        int max = 0;
        String matricula = "";
        String marca = "";
        String modelo = "";
        String[] maxDistance = new String[4];

        for(int i = 0; i < veiculos.length; i++){
            
            if(veiculos[i].distanciaTotal() >= max){
                max = veiculos[i].distanciaTotal();
            }

            if(veiculos[i].distanciaTotal() == max){
                matricula = veiculos[i].getMatricula();
                marca = veiculos[i].getMarca();
                modelo = veiculos[i].getModelo();
            }
        }

        maxDistance[0] = matricula;
        maxDistance[1] = marca;
        maxDistance[2] = modelo;
        maxDistance[3] = Integer.toString(max);

        return maxDistance;
    }

    // lista de veiculos ------------------------------------

    public String printVeiculos(){
        String s = "";
        for(int i = 0; i < veiculos.length; i++){
            s += veiculos[i].toString() + "\n";
        }
        return s;
    }

    // getters & setters -------------------------------------
    

    public String getEmail(){
        return email;
    }


    public Empresa setEmail(String email){
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-_]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
            }else{
                System.out.println("Email Inválido!");
            }
        }
        return this;
    } 

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getZip(){
        return zip;
    }

    public void setZip(String zip){
        this.zip = zip;
    }

    public Veiculo[] getVeiculos(){
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos){
        this.veiculos = veiculos;
    }

    @Override
    public String toString() {
        return printVeiculos();
    }
}
