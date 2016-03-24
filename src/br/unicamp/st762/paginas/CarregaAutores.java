package br.unicamp.st762.paginas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarregaAutores {

	/*
	 * Carrega um HashMap que relaciona autores e artigos
	 */
	public Map<String, File> autores = new HashMap<String, File>();

	public CarregaAutores(String _diretorio) throws IOException {

		File diretorio = new File("./artigos_html");
		File[] listaArquivos = diretorio.listFiles();

		for (File file : listaArquivos) {

			Scanner scanner = new Scanner(new FileInputStream(file));

			while(scanner.hasNextLine()) {
				String string = scanner.nextLine();
				if(string.startsWith("autores:")) {
					autores.put(string, file);
				}
			}

			scanner.close();

		}

	}

}
