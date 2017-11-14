package boletin9_1;
import java.util.Scanner;
public class Numeros {
//Calcula a cantidade de números negativos, positivos e, ceros que hai nun grupo de 10 numeros. 
Scanner ler = new Scanner(System.in);

public void Condicion(){
    int i=0,CP=0,CN=0,C0=0;
   
    while(i<10){
         System.out.println("Escriba un número:");
         int num = ler.nextInt();
        
        if(num<0){
          CN++;
          
        }
        else if(num>0){
            CP++;
        
        }
    
        else{
            C0++;
        
        }
    
    i++;
    }
    System.out.println("Negativos = "+CN+" Positivos = "+CP+" Ceros = "+C0);
}




}
