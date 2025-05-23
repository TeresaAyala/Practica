package Model;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Sueldo {
    public static void  main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double Sueldo,Descuento;

        System.out.println("Escriba el sueldo");
        Sueldo = Double.parseDouble(entrada.next());

        if(Sueldo < 500.00){
            Descuento = 0.00;

        }else if (Sueldo >= 500.00 && Sueldo > 750.00) {
            Descuento = Sueldo * 0.05;
        }
        else{
            Descuento = Sueldo * 0.10;
        }

            System.out.println("");
            System.out.println("El descuento es $ " + Descuento);

    }
}
