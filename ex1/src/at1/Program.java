package at1;

import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n[] = new int [9];
	int i;
	
	for (i=0 ; i<9 ; i++) {
		System.out.println("Escreva um numero inteiro: ");
		n[i]=sc.nextInt();
		
		
	}
	for (i=0 ; i<9 ; i++) {
		if (n[i]%2==0) {
			
		}else 
	
			System.out.println(n[i] + " Na posi??o " + i + " ? um numero impar");	
		}
}
}
