package br.unicamp.st762.paginas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import br.unicamp.st762.interfaces.HTML_Serializable;

public class Artigo implements HTML_Serializable {

	private Titulo titulo;
	private List<Autor> autores;
	private Resumo resumo;
	private ArqPDF pdf;
	private static int count = 1;
	private int id = count++;

	public Artigo() {
	}

	public Artigo(Titulo titulo, List<Autor> lista, Resumo resumo, ArqPDF pdf) {

		this.autores = lista;
		this.setTitulo(titulo);
		this.setResumo(resumo);
		this.setPdf(pdf);
	}

	@Override
	public void geraHTML() throws IOException {

		File file = new File(this.pdf.toString().substring(0, this.pdf.toString().length()-3));
		PrintStream saida = new PrintStream(new FileOutputStream("artigos_html/" + file + "html"));

		saida.println("<html>");

		saida.println("<head>");
		saida.println("</head>");
		saida.println("<body>");

		saida.println("<p>");
		saida.print("titulo: " + this.titulo);
		saida.println("</p>");
		saida.println("<p>");
		saida.print("autores: " + this.autores);
		saida.println("</p>");
		saida.println("<p>");
		saida.print("resumo: " + this.resumo);
		saida.println("</p>");

		saida.println("</body>");
		saida.println("</html>");

		saida.close();
		System.out.println("ok\n");
	}

	@Override
	public String toString() {
//		return super.toString();
		return this.titulo.toString();
	}
//	@Override
//	public String toString() {
//		String artigo = titulo.getTitulo();
//		artigo += titulo.toString() + ", " + resumo.toString();
//		return artigo;
//	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
	}

	// public ArrayList<Autor> getAutores() {
	// return autores;
	// }
	//
	// public void setAutores(ArrayList<Autor> autores) {
	// this.autores = autores;
	// }

	public Resumo getResumo() {
		return resumo;
	}

	public void setResumo(Resumo resumo) {
		this.resumo = resumo;
	}

	public ArqPDF getPdf() {
		return pdf;
	}

	public void setPdf(ArqPDF pdf) {
		this.pdf = pdf;
	}

}
