package Ejercicio3;

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
        System.out.println("primer valor mayor");
        int mayorValor=sc.nextInt();
        System.out.println("segundo valor menor");
        int menorValor=sc.nextInt();

        for(int i=0;i<numerosEnteros.length;i++){
            if (numerosEnteros[i]<mayorValor && numerosEnteros[i]>menorValor){
                System.out.println("numero posicion " +i+ ": ");
                System.out.println(numerosEnteros[i]);
            }
        }
    }
}
