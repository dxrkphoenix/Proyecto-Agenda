package entornos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class tipoUnion {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<String> nombre = new ArrayList<String>();
	        System.out.println("Lista de nombres. \n");
		        String n;
		        int salida=1;
	            int cont=0;
		        while(salida != 0)
		        {
		            
		            System.out.print("Escribe un nombre: ");
		            n = sc.next();
		            nombre.add(n);
	                cont++;

		            System.out.println("¿Quieres continuar? (0=no, 1=si)");
		            salida = sc.nextInt();
		            System.out.println("");
		        }

		        System.out.println("");
		        Collections.sort(nombre);

	            int c=1;
		        for (String x:nombre)
	            {
		        System.out.print(x);
	            if(c==cont)
	            System.out.print(".");
	            else
	            System.out.print(", ");
	            c++;
	            }

	}

}
