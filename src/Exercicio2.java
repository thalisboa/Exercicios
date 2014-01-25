import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        
     Scanner in = new Scanner(System.in);
        
      int num;
      int soma = 0;
      int vetorpar[] = {2,4,6,8,10,12,14,16,18,20};
      
         System.out.println("Digite um numero inteiro par:");
           num = in.nextInt(); 
         
           if(num % 2 == 0){
            
             for(int i = 0; i<num;i++ ){  
                 
              soma = soma + vetorpar[i];
                   
             } System.out.println("Soma do vetor aquivale a:" +soma);    
           }else{
               
               System.out.println("Voce nao informou numero inteiro par e positivo");
      }
   }
}

