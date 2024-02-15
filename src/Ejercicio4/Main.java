package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce todos los numeros que quieres introducir");
        int longArray = sc.nextInt();
        int[] numerosEnteros=new int[longArray];
        System.out.println("\n");

        for(int i=0;i<numerosEnteros.length;i++){
            System.out.println(("introduce el numero que quieras "));
            numerosEnteros[i]=sc.nextInt();
        }

        for(int i=0;i<numerosEnteros.length-1;i++){
            numerosEnteros[i]=numerosEnteros[i+1];
            System.out.println(numerosEnteros[i]);
        }
    }
}
