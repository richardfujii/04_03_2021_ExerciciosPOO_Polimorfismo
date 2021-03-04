package Exercicio;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		int idade1;
		int idade2;
		int idade3;
		String nome1;
		String nome2;
		String nome3;
		String som1;
		String som2;
		String som3;
		
		Cachorro cao = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal bicho = null;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o tipo do seu animal?"+"\n1-Cachorro\n2-Cavalo\n3-Preguiça");
		int tipo = entrada.nextInt();
		
		switch(tipo) {
		case 1:
			bicho = cao;
			System.out.println("Qual o nome do seu cachorro?");
			nome1 = entrada.next();
			System.out.println("Qual a idade do seu cachorro?");
			idade1 = entrada.nextInt();
			System.out.println("Qual o som emitido do seu cachorro?");
			som1 = entrada.next();
			System.out.println("\n");
			bicho.Nome(nome1);
			bicho.Idade(idade1);
			bicho.Som(som1);
			cao.Correr();
			break;
		case 2:
			bicho = horse;
			System.out.println("Qual o nome do seu cavalo?");
			nome2 = entrada.next();
			System.out.println("Qual a idade do seu cavalo?");
			idade2 = entrada.nextInt();
			System.out.println("Qual o som emitido do seu cavalo?");
			som2 = entrada.next();
			System.out.println("\n");
			bicho.Nome(nome2);
			bicho.Idade(idade2);
			bicho.Som(som2);
			horse.Correr();
			break;
		case 3:
			bicho = preguica;
			System.out.println("Qual o nome da sua preguiça?");
			nome3 = entrada.next();
			System.out.println("Qual a idade da sua preguiça?");
			idade3 = entrada.nextInt();
			System.out.println("Qual o som emitido da sua preguiça?");
			som3 = entrada.next();
			System.out.println("\n");
			bicho.Nome(nome3);
			bicho.Idade(idade3);
			bicho.Som(som3);
			preguica.subirArvores();
			break;
		}
	}

}
