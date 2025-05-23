package Model;

import java.util.Scanner;

public class ElementosQuimicos {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String[][] elementos = new String[4][4];

        System.out.println("Escriba el nombre de 16 Elementos quimicos: ");
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {

                    System.out.println("Elemento [" + i + "][" + j + "] : ");

                    elementos[i][j] = scanner.nextLine();

                }

            }

        System.out.println("\nNatriz completa de elementos: ");

        for (int i = 0 ; i < 4 ;i ++ ){

            for (int j = 0; j < 4; j++) {

                System.out.println(elementos[i][j] + "\t");

            }

            System.out.println();
        }

        System.out.println("\nElementos con indice de fila y columna pares: ");

        for (int i = 0; i < 2; i+= 2) {
            for (int j = 0; j < 4; j += 2) {

                System.out.println(elementos[i][j] + "\t");
            }

            System.out.println();
        }


    }

}
