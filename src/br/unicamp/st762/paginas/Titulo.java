package br.unicamp.st762.paginas;

public class Titulo {
	private String titulo;

	public Titulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return this.titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
}
