package Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PartidosGanados {
    public static void main(String[] args){

        Scanner  entrada = new Scanner(System.in);

        double Ganados,Empatados,Perdidos,Puntos;

        System.out.println("Escriba el numero de partidos ganados");
        Ganados = Double.parseDouble(entrada.next());

        System.out.println("Escriba el numero de partidos Empatados");
        Empatados = Double.parseDouble(entrada.next());

        System.out.println("Escriba el numero de partidos Perdidos");
        Perdidos = Double.parseDouble(entrada.next());

        Puntos = (Ganados * 3) + (Empatados * 1);

        System.out.println("");
        System.out.println("El equipo tiene un total de " + Puntos + "Puntos");

    }
}