package br.unicamp.st762.paginas;

public class ArqPDF {
	private String pdf;

	public ArqPDF(String pdf) {
		this.pdf = pdf;
	}

	@Override
	public String toString() {
		return this.pdf;
	}
	
	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	
}
