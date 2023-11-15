package Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		ArrayList<String> cores = new ArrayList<String>();
		

		for(int i=0;i<5;i++) {
			System.out.println("\nDigita a cor número "+(i+1)+" : ");
			//String cor = leia.nextLine();
			cores.add(leia.nextLine());
		}
		
		Iterator<String> iterator = cores.iterator();

		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Collections.sort(cores);
		System.out.println("\nCores ordenadas: ");
		System.out.println("\n"+cores);

	}

}