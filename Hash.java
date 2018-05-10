package ESTRUTURAS;
import MODELOS.*;

public class Hash {
private LEncade[] hash=new LEncade[11];
    
    public void adicionar(Transportador trans){
        int indice=this.funcaohash(trans.getCpf());
        if(hash[indice]==null){
            hash[indice]=new LEncade();
        }
        hash[indice].addInicio(trans);
    }
    
    public Object remover(int chave){
        int indice=this.funcaohash(chave);
        if(hash[indice]==null){
            System.out.println("Errado");
            return 0;
        }else{
            return hash[indice].remover();
        }
    }
    
    private int funcaohash(int chave){
        return chave*(19/64)%hash.length;
    }
}
