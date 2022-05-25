package Aula6.EX1;



public class Bolseiro extends Aluno{
    private int bolsa;
	


	public Bolseiro(String nome, int cc, Date dataNasc) {
		super(nome, cc, dataNasc);
	}

	public Bolseiro(String nome, int cc, Date dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
		this.bolsa = bolsa;
	}

	//getters e setters

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}

    @Override
	public String toString() {
		return this.getNome() + ", NMec: " + this.getNMec() + ", Bolsa: " + bolsa;
	}
}
