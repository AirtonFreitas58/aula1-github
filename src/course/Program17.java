package course;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String sentence = sc.nextLine();
	String x, y, z;
	x = sc.next();
	y = sc.next();
	z = sc.next();
	
	System.out.println(sentence);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	//<digitar:>
	// Bom dia!	
	//Vermelho
	//azul
	//verde
	// <Saida>
	//Bom dia!	
	//Vermelho
	//azul
	//verde
	
	x = sc.next();
	y = sc.next();
	z = sc.next();
	//<Digita>
	//amarelo roxo preto
	// <Saida>
	//amarelo
	//roxo
	//preto
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	
	sc.close();
		
	}

}
