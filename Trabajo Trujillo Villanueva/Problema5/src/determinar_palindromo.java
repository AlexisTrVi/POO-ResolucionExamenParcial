import java.util.Scanner;

public class determinar_palindromo {
	public static Scanner escribir;
	public static void main(String[] args) {
		
			
				escribir = new Scanner(System.in);
				System.out.println("Introduce una palabra o frase");	
				String palabra = escribir.nextLine();
				
				
				String almacen = palabra;
				
				palabra = palabra.toLowerCase ();
				palabra = palabra.replace (" ","");
				palabra = palabra.replace (",","");
				palabra = palabra.replace (".","");

				int inicio = 0;

				int fin = palabra.length()-1;
				
				boolean merror = false;		
				
					while  ((inicio<fin) && (!merror)){
						if (palabra.charAt(inicio) == palabra.charAt(fin)) { 
							inicio++;
							fin--;
						} else {
							merror = true;
						}
					}
				if (!merror) {
					System.out.println(almacen + " - Es un palíndromo");
				}else {
					System.out.println(almacen + "  - No es un palíndromo");
				}

	}

}