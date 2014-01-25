import java.util.Scanner;

public class Exercicio1 {
 
    public static void main(String[] args){
     
    Scanner in = new Scanner(System.in);
    
    int vetor[] = new int[3];
    int num;
    int quadrado;
   
    for(int i= 0;i<vetor.length;i++){
    
    System.out.println("\t Digite valores seguido de 0!!!! ");
    System.out.println("Digite o  "+(i+1)+ "numero: ");
    vetor[i]= in.nextInt();
    
    while (vetor[i] != 0){
    }
     quadrado = vetor[i]*vetor[i];
     vetor[i] = quadrado;
     System.out.println("resultado: "+vetor[i]);    
  } 
 }   
}   

