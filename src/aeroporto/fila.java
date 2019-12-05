package aeroporto;

public class fila {
  int tamanho=0;
  Aviao inicio = null;
  Aviao fim= null;

  public boolean IsEmpty(){
    return inicio==null;
  }
  public void enqueue(final Aviao a) {
    final Aviao novo = a;
    if (IsEmpty()) {
      this.fim = novo;
    } else {
      novo.prox = inicio;
      inicio.Ant = novo;
    }
    inicio = novo;
    tamanho++;
  }

  public Aviao dequeue() {
    final Aviao novo = fim;
    if(!IsEmpty()){
      if(this.tamanho==1){
        this.inicio=null;
        this.fim=null;
        this.tamanho--;
        return novo;
      }
      fim=fim.Ant;
      fim.prox=null;
    }
    this.tamanho--;
    return novo;
  }
    public int busca1(){
      int contador=0;
      Aviao novo;
      novo=this.inicio;
      while(novo.combustivel>=1){
        if(novo.combustivel==1){
          return contador;
        }
        novo=novo.prox;
        contador++;

      }
    return -1;
    }
    public void remove(final int c){
      if (c==0){
        dequeue();
      }
      else if(c!=tamanho-1){
        tamanho--;
        final Aviao novo = inicio;
      }
    }
    public void queueDecolar(final Aviao aviao) {
      this.fim.prox = aviao;
      this.fim = this.fim.prox;
      this.fim.id = aviao.id;
      this.fim.prox = null;
      this.tamanho++;
    }
    public void dequeueDecolar(final Aviao aviao) throws Exception {
      if (this.IsEmpty())
        throw new Exception("Erro: Lista vazia");
      final Aviao aux = aviao.prox;
      this.inicio = null;
      this.inicio = aux;
      this.inicio.prox = aux.prox;
      if(aux.prox == null) {
        this.fim = aux;
      }
      
      this.tamanho--;  
      
    }
    public void imprime () {
      Aviao aux = this.inicio.prox;
      while (aux != null) {
        System.out.println("Id: " + aux.id + ". Combustivel: " + aux.combustivel + ". Quant elementos: " + this.tamanho); 
        aux = aux.prox;
      }
    }
  }
