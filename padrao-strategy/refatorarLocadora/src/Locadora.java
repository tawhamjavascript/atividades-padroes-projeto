//********** import para executar o código conforme modificações da lista01.2.1-GRASP-refactoring
import locadora.*;

import java.util.Scanner;
//********** import para executar o código conforme modificações da lista01.2.2-GRASP-refactoring
//import refactoring1.Cliente;
//************************************************************************************************
//********** import para executar o código conforme modificações da lista01.2.3-GRASP-refactoring
//import refactoring2.Cliente;
//import refactoring2.Aluguel;
//************************************************************************************************


public class Locadora {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Alex Sandro");

		c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", DVD.NORMAL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Luca", DVD.INFANTIL), 2));
		c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2", DVD.LANÇAMENTO), 30));
		c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto", DVD.LANÇAMENTO), 4));
		c1.adicionaAluguel(new Aluguel(new DVD("Moana", DVD.INFANTIL), 10));
		c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", DVD.NORMAL), 3));

		System.out.println("Extrato SHELL: 0" );
		System.out.println("Extrato HTML: 1" );
		System.out.print("Infome o tipo de extrato: ");
		Scanner sc = new Scanner(System.in);
		int tipoExtrato = sc.nextInt();
		sc.close();


		Extrato extrato = FabricaSimplesExtrato.getExtrato(tipoExtrato, c1);

		System.out.println(extrato.extrato());


	}
}
