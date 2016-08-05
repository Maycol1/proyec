package labsemana1;

import java.util.Scanner;

public class Sema1 {
	public static void main(String[]args){
		Scanner s= new Scanner (System.in);
		System.out.print("ingrese un numero: ");
		int numero=s.nextInt();
		if (numero>10){
			System.out.print("el numero es mayor que 10: ");
		}
		else{
			System.out.print("el numero es menor que 10: ");
		}
		
		
	}

}
