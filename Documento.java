package MODELOS;
import ESTRUTURAS.LDE;

public class Documento {
	private static int id=0;
	private int prioridade;
	private String bibliotecario,nomeAluno,campusAluno;
	private Livro livro;

	
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioriade) {
		this.prioridade = prioriade;
	}
	public Documento(String estagiario,String nomeAluno,String campus) {
		super();
		id++;
		this.bibliotecario=estagiario;
		this.nomeAluno = nomeAluno;
		this.campusAluno = campus;
		this.livro = new Livro();
	}
	

	
	
}
