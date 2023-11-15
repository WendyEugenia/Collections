package Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionSet {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		List<Integer> numeros = new ArrayList<Integer>();	
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		if (numeros.contains(numero)) {
			
			System.out.println("\nO número "+numero+" foi encontrado!");
		} else {
			System.out.println("\nO número "+numero+" não foi encontrado!");
		}
	}
}