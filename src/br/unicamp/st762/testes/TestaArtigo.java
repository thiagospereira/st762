package br.unicamp.st762.testes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.unicamp.st762.paginas.ArqPDF;
import br.unicamp.st762.paginas.Artigo;
import br.unicamp.st762.paginas.Autor;
import br.unicamp.st762.paginas.Resumo;
import br.unicamp.st762.paginas.Titulo;

public class TestaArtigo {
	public static void main(String[] args) throws IOException {
		
		Titulo titulo = new Titulo("Artigo");
		Resumo resumo = new Resumo("Resumo/Abstract do artigo. ");
		ArqPDF pdf = new ArqPDF("pdf");

		Autor autor1 = new Autor("Juliano");
		Autor autor2 = new Autor("Jorge");
		Autor autor3 = new Autor("Dacio");
		List<Autor> autores = new ArrayList<Autor>();
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);

		Artigo artigo = new Artigo(titulo, autores, resumo, pdf);

		artigo.geraHTML();
		
//		File directory = new File(".");
//        File[] fList = directory.listFiles();
//        for (File file : fList){
//        	if( file.getName().endsWith(".txt") ) {
//                System.out.println(file.getName());
//        	}
//        }

	}

}
