
public class Pilha {
    
    public Object[] pilha;  //declarando a pilha com o Object para armazenar textos ou numeros
    
    public int posicaoPilha; //variavel para armazenar a posicao atual da pilha
    
    
    
    public Pilha(){   //construtor que define o tamanho da pilha e a inicializacao da posicao
        this.posicaoPilha =-1;
        this.pilha = new Object[10]; //criando uma pilha com 10 posicoes
         
     }
    
    public boolean pilhaVazia(){ 
    if (this. posicaoPilha == -1){
        return true;
    }else{
        return false;
    }
  }
   
    public int tamanho(){
                                //funcao que retorna o tamanho da pilha
    if(this.pilhaVazia()){
        return 0;   //nao tem conteudo dentro da pilha
    }
    return this.posicaoPilha+1; //indica qts itens tem na pilha 
    }
        
      public  void empilhar(Object valor){//funcao para empilhar a pilha
       //push
      if(this.posicaoPilha < this.pilha.length - 1){ //verif se a posicao da pilha eh menor que o tamanho
       this.pilha[++posicaoPilha] = valor;
      
   }   
}                              
      public Object desempilhar(){                //Desempilhar
          //pop
        if(pilhaVazia()){
            return null;
        }  
        return this.pilha[this. posicaoPilha --];
         
      }                
      
      public Object exibeUltimoValor() { 
        //top 
       if (this.pilhaVazia()) { 
       return null; 
        } 
        return this.pilha[this.posicaoPilha]; 
       }

      public static void main (String[] args){
          Pilha p = new Pilha();
          
          p.empilhar("Portuguesa");
          p.empilhar("Frango com catupiry");
          p.empilhar(4);
          p.desempilhar();
          p.exibeUltimoValor();
       
          
            while(p.pilhaVazia() == false){
                System.out.println(p.desempilhar());
            }
      }
}