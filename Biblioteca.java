package Controle;
import MODELOS.*;
import ESTRUTURAS.*;

public class Biblioteca {
	
	private LDE livros;
	private Livro livro;
	private FilaDeDocumentos fila;
	
	public Biblioteca() {
		this.livros = new LDE();
		this.livro = new Livro();
		this.fila = new FilaDeDocumentos();
	}
	
	
	public void castrarDocumentos(Livro livro) {
		livros.addInicio(livro);
	}
	
	public Livro removerDocumentos() {
		return fila.removerInicio();
	}
	
	
	
	
	
	
}
