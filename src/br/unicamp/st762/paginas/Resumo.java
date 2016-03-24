package br.unicamp.st762.paginas;

public class Resumo {
	private String resumo;

	public Resumo(String resumo) {
		this.resumo = resumo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	@Override
	public String toString() {
		return this.resumo;
	}
}
