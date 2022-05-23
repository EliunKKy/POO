package Aula8.EX_1;

public class Empresa {
    private String nome, zip; 
    static Veiculo[] veiculos = new Veiculo[5];
    

    public empresa(String nome, String zip, String email, Veiculo[] veiculos){
        this.nome = nome;
        this.zip = zip;
        this.email = email;
        this.veiculos = veiculos;
    }

    public String dados(String nome, String zip, String email){
        String dados[] = new String[3];
        dados[0] = nome;
        dados[1] = zip;
        dados[2] = email;

        String s = "Nome da empresa: " + dados[0] + "\nCódigo postal: " + dados[1] + "\nE-mail: " + dados[2];

        return s;
    }

    // comparar distâncias ------------------------------------

    public String[] CompararD(){
        int max = 0;
        String matricula = "";
        Stinrg marca = "";
        String modelo = "";
        String[] maxDistance = new String[5];


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

        return max;
    }

    // lista de veiculos ------------------------------------

    public static Veiculo[] listaVeiculos(){
        

        veiculos[0] = new Motociclo( "Honda", "CBR 1000 RR", 217, "desportivo").setMatricula("00-AA-00");
        veiculos[1] = new Ligeiro("Audi", "A6", 326, 100, 250).setMatricula("00-BB-00");
        veiculos[2] = new Taxi("Volkswagen", "Beetle", 168, 201, 300, 405).setMatricula("00-FF-54");
        veiculos[3] = new PesadoP("Mercedes", "Citaro", 299 , 200, 1000, 50).setMatricula("00-00-CC");
        veiculos[4] = new PesadoM("Volvo", "FH", 540, 202, 3000, 500).setMatricula("90-EA-54");

        return veiculos;
    }

    

    public String printVeiculos(){
        Veiculo[] veiculos = listaVeiculos();
        String s = "";
        for(int i = 0; i < veiculos.length; i++){
            s += veiculos[i].toString() + "\n";
        }

        return s;
    }

    // getters & setters -------------------------------------

    public String getNome(){
        return nome;
    }

    public void setNome(Stirng nome){
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
