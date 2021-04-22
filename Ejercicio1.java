import java.util.Scanner;

public class  Ejercicio1{
	public static void main(String args[]) {
		Scanner teclado= new Scanner(System.in);
		int no1, no2, no3;

		System.out.print("Ingrese el primer valor: ");
		no1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		no2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor: ");
		no3=teclado.nextInt();

		if (no1>no2 && no1>no3){
			int suma= no1+no2+no3;
			System.out.println("El primer valor es mayor ");
			System.out.println("El resultado de la suma es: "+suma);

		}else{
		if (no2>no3) {
			int resta= no1-no2-no3;
			System.out.println("El segundo valor es mayor ");
			System.out.println("El resultado de la resta es: "+resta);
		}
	}
}
}