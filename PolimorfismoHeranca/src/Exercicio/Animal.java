package Exercicio;

public abstract class Animal {
	private String tipoAnimal;
	private String nome;
	private String som;
	private int idade;
	
	
	public Animal(String tipoAnimal)
	{
		this.tipoAnimal=tipoAnimal;
	}
	
	abstract public void Nome(String nome);
	abstract public void Idade(int idade);
	abstract public void Som(String som);

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
