/******************************************************************************

2.   
Escreva um programa que exiba os números pares de 1 a 50 
e os números ímpares de 51 a 100 utilizando um laço de repetição. Utilize for.

*******************************************************************************/
import java.util.Scanner;
public class Ex56 {
	public static void main(String[] args) {
	    System.out.println("Números pares de 1 a 50: ");
	    for (int numero = 1; numero <= 50; numero++) {
	        if (numero % 2 == 0) {
	            System.out.println(numero);
	        }
	        }
	        System.out.println("Números ímpares de 51 a 100: ");
        for (int numero = 51; numero <= 100; numero++) {
            if (numero % 2 == 1) {
                System.out.println(numero);
            }
	    }
	}
}