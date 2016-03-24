package br.unicamp.st762.paginas;

import java.io.IOException;

import br.unicamp.st762.interfaces.HTML_Serializable;

public class Autor implements HTML_Serializable {
	private String nome;
	
	public Autor() {}

	public Autor(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public void geraHTML() throws IOException {
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
