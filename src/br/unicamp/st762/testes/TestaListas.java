package br.unicamp.st762.testes;

import java.util.ArrayList;
import java.util.List;

import br.unicamp.st762.paginas.Artigo;

public class TestaListas {
	
	public static void main(String[] args) {
		
		List<Artigo> lista = new ArrayList<Artigo>();
		
		for (int i = 0; i < 5; i++) {
			lista.add(new Artigo());
		}
		
		for (Artigo artigo : lista) {
			System.out.println(artigo);
		}
		
	}

}
