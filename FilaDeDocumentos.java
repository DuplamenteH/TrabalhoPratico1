package ESTRUTURAS;

import MODELOS.*;

public class FilaDeDocumentos {
	
	private int tam;
    private No inicio,fim;
	
	public void addInicio(Livro L) {
	        No livro = new No();
	        livro.setValor(L);
	        if (inicio == null) {
	            inicio = livro;
	            fim = livro;
	        } else {
	            livro.setProx(inicio);
	            inicio.setAnt(livro);
	            inicio = livro;
	        }
	        tam++;
	    }
	 
	 public Livro removerInicio(){
	        Livro aux = (Livro) inicio.getValor();
	        if(tam==1){
	          inicio=null;
	          fim=null;
	          tam--;
	          return aux;
	        }else{
		        inicio=inicio.getProx();
		        inicio.setAnt(null);
		        tam--;
		        return aux;
	        }
	    }
}
