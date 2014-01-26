import java.util.Scanner;

public class Exercicio7 {
   public static void main (String[] args){
    
    int num,soma;
    
    Scanner in = new Scanner(System.in);
    
    int vetor[] = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};

    System.out.println("Digite um numero inteiro:");
    num = in.nextInt();
       
    
    if(num % 2 == 0){
        
     for(int i = 0; i<(num-2);i++){    
        
       soma = soma + vetor[i];
         
      // System.out.println("Saida dos valores pares:"+vetor[i]);   
     } System.out.println("Saida dos valores pares:"+vetor[i]);  
    }else{
        
        System.out.println("Voce nao digitou numero inteiro");
      
      }
   }
}