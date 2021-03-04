package Exercicio;

public class Cachorro extends Animal{
	
	public Cachorro()
	{
		super("Cachorro");
	}
	@Override
	public void Nome(String nome)
	{
		System.out.println("Nome: "+nome);
	}
	@Override
	public void Idade(int idade)
	{
		System.out.println("Idade: "+idade);
	}
	public void Som(String som)
	{
		System.out.println("Som do cachorro: "+som);
	}
	public void Correr()
	{
		System.out.println("O cachorro está correndo!");
	}
	
	

}
