package br.unicamp.st762.paginas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Carregador {

	public List<Artigo> artigos = new ArrayList<Artigo>();
	public List<Autor> autores = new ArrayList<Autor>();

	public Carregador(String _diretorio) throws IOException {

		File diretorio = new File(_diretorio);
		File[] listaArquivos = diretorio.listFiles();

		for (File file : listaArquivos) {
			if (file.getName().endsWith(".txt")) {

				Scanner scanner = new Scanner(new FileInputStream(file));

				Titulo titulo = new Titulo(scanner.nextLine());

				/*
				 * O método split da string recebe um parâmetro e o utiliza como
				 * separador, gerando um array de Strings. O método
				 * Arrays.asList recebe esse array e devolve uma lista. Com um
				 * laço do tipo for each percorremos a lista e utilizamos cada
				 * elemento para gerar um objeto do tipo Autor e adicioná-lo à
				 * lista de autores do artigo.
				 */
				for (String item : Arrays.asList(scanner.nextLine().split("[,]"))) {
					autores.add(new Autor(item));
				}

				Resumo resumo = new Resumo(scanner.nextLine());
				ArqPDF pdf = new ArqPDF(scanner.nextLine());
				
				artigos.add(new Artigo(titulo, autores, resumo, pdf));

				scanner.close();

			}
		}

	}
}
