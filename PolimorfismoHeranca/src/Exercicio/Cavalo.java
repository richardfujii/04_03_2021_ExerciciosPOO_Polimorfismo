package Exercicio;

public class Cavalo extends Animal{
	
	public Cavalo()
	{
		super("Cavalo");
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
		System.out.println("O cavalo está correndo!");
	}

}
