package Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumerosEnteros {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Escriba un numero entero Positivo: ");
       int numero = scanner.nextInt();

       if (numero <= 0){
           System.out.println("El numero debe ser mayor que cero. ");
       }else {
           System.out.println("Numeros inpares entre cero y " + numero + "," );

           for (int i = 1 ; i <= numero; i += 2){
               System.out.println(i);
           }
       }
   }

}
