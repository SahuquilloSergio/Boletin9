package boletin9_3;
import java.util.Scanner;
public class Area {
    Scanner ler = new Scanner(System.in);
    
public void calcularArea(){
int base, altura;
    do{
    System.out.println("Escribe el valor de la base");
    base = ler.nextInt();
    }while(base<0);
    do{
    System.out.println("Escribe el valor de la altura");
    altura = ler.nextInt();
    }while(altura<0);
    
    if(base>0 && altura>0){
     int area = base*altura;
        
     System.out.println("Area = "+(base*altura));
    }
    else{
        System.out.println("Error, el area no puede ser negativa");
    }
}


}

