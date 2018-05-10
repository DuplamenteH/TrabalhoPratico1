package ESTRUTURAS;
import MODELOS.*;

public class LEncade {
	private No inicio=null;
	private int tamanho=0;
	
	
	public void addInicio(Transportador trans) {
		No newno = new No();
		
		newno.setValor(trans.getCpf());
		if(this.tamanho==0) {
			this.inicio=newno.getProx();
		}else {
			newno.setProx(this.inicio);
			this.inicio=newno;
		}
		this.tamanho++;
	}
	
	public Object remover(){
        Object removido=null;
        if(this.tamanho == 0){
            removido = -1;
            System.out.println("Não tem nada na Lista :(");
        }else if(this.tamanho == 1){
            removido = this.inicio.getValor();
            this.inicio = null;
            this.tamanho--;
        }else{
            removido = this.inicio.getValor();
            this.inicio = this.inicio.getProx();
            this.tamanho--;
        }
        return removido;
    }

}
