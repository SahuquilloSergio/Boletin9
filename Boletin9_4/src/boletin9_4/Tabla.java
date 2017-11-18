package boletin9_4;
import java.util.Scanner;
public class Tabla {
    Scanner ler = new Scanner(System.in);
public void condicion(){
    int num;
    
    do{
    System.out.println("Escriba el numero del que desea saber su tabla o pulse 0 para finalizar el programa");
    num = ler.nextInt();
     System.out.println("Tabla del "+num+"="+"\n"+"-----------------------------\n"+num+"*1 = "+num*1+"\n"+
             num+"*2 = "+num*2+"\n"+num+"*3 = "+num*3+"\n"+num+"*4 = "+num*4+"\n"+
             num+"*5 = "+num*5+"\n"+num+"*6 = "+num*6+"\n"+num+"*7 = "+num*7+"\n"+
             num+"*8 = "+num*8+"\n"+num+"*9 = "+num*9+"\n"+num+"*10 = "+num*10+"\n");
    }while(num!=0);
    
    
}
   
}
