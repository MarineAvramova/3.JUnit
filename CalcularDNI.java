import java.util.Scanner;

public class CalcularDNI {

	public static void main(String[] args) {
		int numero;
		int resto;
		char letra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre el numero de DNI: ");
		numero = entrada.nextInt();
        
		CalcularDNI calcularDNI = new CalcularDNI();
		entrada.close();
		
		try {
			resto = calcularDNI.divisionNumeroDni(numero);
			System.out.println("El resto es " + resto);
			
			letra = calcularDNI.encontrarLaLetra(resto);
			System.out.println("La letra es " + letra);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
			
	}
	
	public int divisionNumeroDni(int numero) {
		int resto = numero % 23;
		return resto;
		}
	
	public char encontrarLaLetra(int resto) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		if(resto < 0 || resto >= letras.length()) {
            throw new ArrayIndexOutOfBoundsException("The number is not valid "
            		+ "for calculating the DNI letter. Please, make sure the number is correct: " + resto);
            
        }
		char letra = letras.charAt(resto);
		return letra;
	}

	}


