package boletin9_5;
import java.util.Scanner;
public class Series {
    Scanner ler = new Scanner(System.in);
public void serie1(){
        System.out.println("Introduzca el numero de veces que quiere que se repita la serie");
        int j = ler.nextInt();
        int i;
        for(i=0;i<j;i++){
            System.out.print(i*2+"+");
        }
     
}
public void serie2(){
    System.out.println("Numero de elementos de la serie");
    int x = ler.nextInt();
    int numb = 0;
    for(int i=0;i<x;i++){
    if(numb<0){
        numb=(numb*(-1)+1);
    }
    else{
        numb=(numb*(-1)-1);
    }
    System.out.print(numb+",");
    }
}
public void serie3(){
    System.out.println("Numero de elementos en la serie");
    int x = ler.nextInt();
    for(int i=0;i<x;i++){
      int numa=0;
      int numb=1;
      int numc = numa+numb;
      numa=numb;
      }
        
        


}

}
