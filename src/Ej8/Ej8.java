package Ej8;

public class Ej8 {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i<=50; i++) {
			if(i % 2 == 0) {
			pares = pares + i;
		}else {
			impares = impares + i;
			}
			
		}
		System.out.println("Suma de pares= " + pares);
		System.out.println("Suma de impares= " + impares);
		}
}



