package ESTRUTURAS;
import MODELOS.Livro;

public class LDE {
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
	        Object aux = inicio.getValor();
	        if(tam==1){
	          inicio=null;
	          fim=null;
	          tam--;
	          return (Livro) aux;
	        }else{
		        inicio=inicio.getProx();
		        inicio.setAnt(null);
		        tam--;
		        return (Livro) aux;
	        }
	    }
	    
	    public Livro removerFim(){
	        Object aux=fim.getValor();
	        fim=fim.getAnt();
	        fim.setProx(null);
	        tam--;
	        return (Livro) aux;
	    } 
	    
	   
	        
	}

