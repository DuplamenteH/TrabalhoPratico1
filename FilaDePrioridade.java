package ESTRUTURAS;

import MODELOS.*;

public class FilaDePrioridade {
	private Documento fila[] = new Documento[10];
	private int contador = 0;
	
	public void criarFila(Documento documento){
		fila[contador+1] = documento;
		contador++;
		subir(contador);	
	}
	
	public void subir(int i) {
		int j = i/2;
		
		if(j>=1){
			if(fila[i].getPrioridade() > fila[j].getPrioridade()){
				Documento aux = fila[i];
				fila[i] = fila[j];
				fila[j] = aux;
	            subir(j);			
			}
		
	}

	}
	public void descer(int i) {
		int j = i*2;
		
		if(j<=contador) {
			if(j<contador) {
				
				if(fila[j+1].getPrioridade() > fila[j].getPrioridade()) {
					j = j+1;
				}
				
				if(fila[j].getPrioridade() > fila[i].getPrioridade()) {
					Documento aux = fila[i];
					fila[i] = fila[j];
					fila[j] = aux;
					descer(j);
				}
				
			}
		}
		
	}
	public Documento remove() {
		Documento retorno = fila[1];
		fila[1]=fila[contador];
		contador --;
		descer(1);
		
		return retorno;
		
	}
}
