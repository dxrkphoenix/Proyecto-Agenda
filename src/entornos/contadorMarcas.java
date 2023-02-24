package entornos;
import java.util.Scanner;
public class contadorMarcas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int numeros[] = new int[10];
	
		for (int i=0;i<numeros.length;i++)
		{
			System.out.print("Introduce número: ");
			x = sc.nextInt();
			numeros[i] = x;
		}
		
		System.out.println("");
		System.out.println("Marcas por categoría:");
		int cont=0;
		
		
		for (int i=0; i<=10; i++)
		{
			for (int j=0; j<numeros.length; j++)
			{
				if (numeros[j] == i)
				cont++;
			}
			
			System.out.println(i + ": " + cont + " marcas(s).");
			cont=0;
		}
		
		sc.close();
	}	

}