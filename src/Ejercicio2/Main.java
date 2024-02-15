package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce todos los numeros que quieres introducir");
        int longArray = sc.nextInt();
        int[] numerosEnteros=new int[longArray];
        System.out.println("\n");

        for(int i=0;i<numerosEnteros.length;i++){
            System.out.println(("introduce el numero que quieras "));
            numerosEnteros[i]=sc.nextInt();
        }

        System.out.println("introduce un numero para que solo se visualice los numeros menores que el");
        int numeroMenor=sc.nextInt();

        System.out.println("\nPosiciones de Arrays");

        for(int i=0;i< numerosEnteros.length; i++){
            if(numerosEnteros[i]<numeroMenor){
                System.out.println("numero posicion " +i+ ": ");
                System.out.println(numerosEnteros[i]);
            }
        }

    }
}
