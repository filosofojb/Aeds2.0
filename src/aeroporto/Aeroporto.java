package aeroporto;

import java.util.Random;
import java.util.Scanner;



public class Aeroporto {
    
    public static void main(String[] args) throws Exception {       
       
        Random rand = new Random();
        
        Pista p1 = new Pista(2);
        Pista p2 = new Pista(2);
        Pista p3 = new Pista(0);             
      
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 1 para continuar");
        
        switch(in.nextInt()) {
            case 1:
                int decolar = rand.nextInt(1) + 30;
                int aterrisar = rand.nextInt(1) + 30;
                
                Aviao aviao = new Aviao();
                
                while (aterrisar > 0 ) {
                	
                    if (p1.Lista.get(0).tamanho <= p1.Lista.get(1).tamanho &&
                    p1.Lista.get(0).tamanho <= p2.Lista.get(0).tamanho &&
                    p1.Lista.get(0).tamanho <= p2.Lista.get(1).tamanho && 
                    aterrisar > 0 ) {
                        p1.Lista.get(1).dequeue();
                        aterrisar--;
                    }
                    else if (p1.Lista.get(1).tamanho <= p2.Lista.get(0).tamanho && 
                    p1.Lista.get(1).tamanho <= p2.Lista.get(1).tamanho &&
                    aterrisar > 0) {
                        p1.Lista.get(1).enqueue(aviao);
                        aterrisar--;
                    }
                    else if (p2.Lista.get(0).tamanho <= p2.Lista.get(1).tamanho && 
                    aterrisar > 0) {
                        p2.Lista.get(0).enqueue(aviao);
                        aterrisar--;
                    }
                    else {
                        p2.Lista.get(1).enqueue(aviao);
                        aterrisar--;
                    }
                }
                
                while (decolar > 0) {
                	
                    if (p3.Lista.get(0).tamanho <= p1.Lista.get(2).tamanho &&
                    p3.Lista.get(0).tamanho <= p2.Lista.get(2).tamanho &&
                    decolar > 0) {
                        p3.Lista.get(0).queueDecolar(aviao);//MUDAR queue PARA DECOLAGEM SEM COMBUSTUIVEL
                        decolar--;
                    }
                    else if (p1.Lista.get(2).tamanho <= p2.Lista.get(2).tamanho &&
                    decolar > 0) {
                        p1.Lista.get(2).queueDecolar(aviao);//MUDAR queue PARA DECOLAGEM SEM COMBUSTUIVEL
                        decolar--;
                    }
                    else {
                        p2.Lista.get(2).queueDecolar(aviao);//MUDAR queue PARA DECOLAGEM SEM COMBUSTUIVEL
                        decolar--;
                    }                    
                }
                 // Verificando os combust�veis dos avi�es nas Listas de aterrisagem.
               // Aterrisagem//
                   
                fila Lista1 = new fila();
                Lista1 = p1.Lista.get(0);
                
                  while(Lista1 != null ) {                	  
                	  for(int i = 0; i <Lista1.tamanho;i++) {
                	          if(Lista1.inicio.verificaCombustivel()) {
                	        	  Lista1.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      
                	  }   
                	  
                  }
                  
                  fila Lista2 = new fila();
                  Lista2 = p1.Lista.get(1);
                  while(Lista2 != null ) {                	  
                	  for(int i = 0; i <Lista2.tamanho;i++) {
                	          if(Lista2.inicio.verificaCombustivel()) {
                	        	  Lista2.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      
                	  }

                  }
                  
                  fila Lista3 = new fila();
                  Lista3 = p2.Lista.get(0);
                  while(Lista3 != null ) {                	  
                	  for(int i = 0; i <Lista3.tamanho;i++) {
                	          if(Lista3.inicio.verificaCombustivel()) {
                	        	  Lista3.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      
                	  }

                  }
                  
                  
                  fila Lista4 = new fila();
                  Lista4 = p2.Lista.get(1);
                  
                  while(Lista4 != null ) {                	  
                	  for(int i = 0; i <Lista4.tamanho;i++) {
                	          if(Lista4.inicio.verificaCombustivel()) {
                	        	  Lista4.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      

                	  }
                  }
                  

                  
                  //Verificando combustivel dos avi�es nas Listas de decolagem
                  
                  fila Lista5 = new fila();
                  Lista5 = p3.Lista.get(0);
                  while(Lista5 != null ) {                	  
                	  for(int i = 0; i <Lista5.tamanho;i++) {
                	          if(Lista5.inicio.verificaCombustivel()) {
                	        	  Lista5.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      

                	  }
  
                  }
                  
                  fila Lista6 = new fila();
                  Lista6 = p1.Lista.get(2);
                  
                  while(Lista6 != null ) {                	  
                	  for(int i = 0; i <Lista6.tamanho;i++) {
                	          if(Lista6.inicio.verificaCombustivel()) {
                	        	  Lista6.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		      
                	  }

                  }
                  
                  fila Lista7 = new fila();
                  Lista7 =  p2.Lista.get(2);
                  
                  while(Lista7 != null ) {                	  
                	  for(int i = 0; i <Lista7.tamanho;i++) {
                	          if(Lista7.inicio.verificaCombustivel()) {
                	        	  Lista7.dequeue();                	        	  
                	          }
                		      else {
                		    	  break;
                		      }               		                             		                   		                     		  
                	  }
                	                  		                 	                  	  
                  }
                  
                  
                  
                  
                  
                 
               
                  
                             
        }
        
        System.out.println("p1 - ATERRISAGEM 1");
        p1.Lista.get(0).imprime();
        System.out.println("p1 - ATERRISAGEM 2");
        p1.Lista.get(1).imprime();
        System.out.println("p2 - ATERRISAGEM 1");
        p2.Lista.get(0).imprime();
        System.out.println("p2 - ATERRISAGEM 2");
        p2.Lista.get(1).imprime();
        
        System.out.println("p1 - DECOLAGEM 1");
        p1.Lista.get(2).imprime();
        System.out.println("p2 - DECOLAGEM 1");
        p2.Lista.get(2).imprime();
        System.out.println("p3 - DECOLAGEM 1");
        p3.Lista.get(0).imprime();
    }
    
}
