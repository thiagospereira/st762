package br.unicamp.st762.paginas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import br.unicamp.st762.interfaces.HTML_Serializable;

public class Autores implements HTML_Serializable{

	@Override
	public void geraHTML() {
		File directory = new File(".");
        File[] fList = directory.listFiles();
        
        /*
         * Ler todos os arquivos e adicionar os autores, um a um, em uma lista.
         * Percorrer a lista criando as entradas para cada autor com um link para uma página com seus artigos.
         */
        
        for (File file : fList){
        	if( file.getName().endsWith(".txt") ) {
        		try {
					Scanner scanner = new Scanner(file);
	                PrintStream saida = new PrintStream(new FileOutputStream("autores_html/" + file + ".html"));
	                
					saida.println("<html>");
					
					saida.println("<head>");
					saida.println("</head>");
					saida.println("<body>");

					saida.println("<p>");
					scanner.nextLine(); // o arquivo não pode estar vazio, ou gerará um erro em tempo de execução
					saida.println(scanner.nextLine());
					saida.println("</p>");

					saida.println("</body>");
					saida.println("</html>");
					
					scanner.close();
					saida.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
        	}
			System.out.println('\n');
        }
	}
}
