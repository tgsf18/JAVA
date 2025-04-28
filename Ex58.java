/******************************************************************************
 
 4.   
 Crie um programa que solicite ao usuário um número 
 e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.
 
 *******************************************************************************/
 import java.util.Scanner;
 
 public class Ex58 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Digite um número para ver a tabuada: ");
         int numero = scanner.nextInt();
 
         System.out.println("Tabuada do " + numero + ":");
         for (int i = 1; i <= 10; i++) {
             int resultado = numero * i;
             System.out.println(numero + " x " + i + " = " + resultado);
             i++;
         }
     }
 }