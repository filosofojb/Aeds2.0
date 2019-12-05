package aeroporto;

import java.util.Random;

public class Aviao {
	
	 Object id;
	 Aviao Ant;    
	 Aviao prox;
	 
	 int combustivel = 0;
	 
	 Random rand = new Random();
	 //O Tipo é Definido como 0=Pouso
	 //Tipo 1 = Decolagem
	 
	 public Aviao() {
		 
	 }
	 
	 public Aviao(Object id, Aviao prox, int combustivel,int tipo) {
		 this.id=id;
		 this.prox=prox;
		 this.combustivel = 1 + rand.nextInt(20);
	 }
	 
	 public boolean verificaCombustivel() {
		 boolean semCombustivel;
	if(this.combustivel == 1) {
		semCombustivel = true;
	}
	else {
		semCombustivel = false;
	}
		 return semCombustivel;	 
	 }
	 

	
}
