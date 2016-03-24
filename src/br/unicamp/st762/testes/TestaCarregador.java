package br.unicamp.st762.testes;

import java.io.IOException;

import br.unicamp.st762.paginas.Artigo;
import br.unicamp.st762.paginas.Carregador;

public class TestaCarregador {

	public static void main(String[] args) throws IOException {
		
		Carregador carregador = new Carregador("./artigos_txt");

//		System.out.println(carregador.artigos);
		
		for (Artigo artigo : carregador.artigos) {
			artigo.geraHTML();
		}
		
	}
}
