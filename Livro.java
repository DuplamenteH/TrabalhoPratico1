package MODELOS;

public class Livro {
	private int idLivro;
	private String titulo;
	private String autor;
	private int ano;
	private int edicao;
	
	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public Livro() {
		super();
	}
	public Livro(int idLivro, String titulo, String autor, int ano, int edicao) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.edicao = edicao;
	}
	
}
