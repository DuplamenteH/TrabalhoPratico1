package ESTRUTURAS;
import MODELOS.Livro;

public class No {
	private Object valor;
	private No prox;
	private No ant;
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public No getAnt() {
		return ant;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}
	
	
}
