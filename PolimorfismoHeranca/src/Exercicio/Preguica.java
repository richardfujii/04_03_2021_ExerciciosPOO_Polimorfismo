package Exercicio;

public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Preguica");
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
		System.out.println("Som da preguica: "+som);
	}
	public void subirArvores()
	{
		System.out.println("A preguiça está subindo árvores!");
	}

}
