import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args){
    
        Scanner in = new Scanner(System.in);
        
        int num;
        int vetorimpar[] = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,30};
        
        System.out.println("Digite um numero inteiro positivo:");
        num = in.nextInt();
        
        
        if(num % 2 == 0){
            
            for(int i = 0 ; i<num; i++){
             
             System.out.println("Saida dos valores impares:"+vetorimpar[i]); 
                
            }
       
        }else{ 
            
            System.out.println("Digite um valor inteiro positivo");
        }
    }
}