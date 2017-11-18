package boletin9_2;
import java.util.Scanner;
public class Numeros {
Scanner ler = new Scanner(System.in);
public void Condicion(){
    int i=11, acuSum=0,num=11;
    double acuProd=1;
    while(i>10&&i<90){
        acuSum = acuSum + num;
        acuProd = acuProd * num;
        i++;
        num++;
    }
    System.out.println("Valor Final Suma = "+acuSum);
    System.out.println("Valor Final Produto = "+acuProd);
}





}
