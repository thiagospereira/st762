package br.unicamp.st762.testes;

import java.util.ArrayList;

import br.unicamp.st762.paginas.Autor;

public class TestaAutor {
	
	public static void main(String[] args) {

		ArrayList<Autor> autores = new ArrayList<Autor>();
		
		for (int i = 0; i < 5; i++) {
			autores.add(new Autor(String.valueOf(i)));
		}
		
		for (Autor autor : autores) {
			System.out.println(autor);
		}

	}
	
}