import java.util.*;

public class digitoVerificador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cod;
		boolean naoPossuiLetras;
		
		do {
			//validar numero de digitos
			do {
				naoPossuiLetras = true;
				System.out.print("Digite o código: ");
				cod = sc.nextLine();
				
				if(cod.length() != 11) {
					System.out.println("Tamanho inválido");
				}else {
					for(int i = 0; i < 11; i++) {
						if(cod.charAt(i) < '0' || cod.charAt(i) > '9') {
							System.out.println("Possui letras ou digitos especiais no código;");
							naoPossuiLetras = false;
							break;
						}
					}
				}
			} while(cod.length() != 11 || !naoPossuiLetras);
			
			if(cod.length() == 11 && naoPossuiLetras) {
				calcularDigitos(cod);
			}
		} while(true);
	}
	
	public static void calcularDigitos(String codigo) {
		String subCodigo = codigo.substring(0,9);
		int digito1 = 0;
		int digito2 = 1;
		String stringDigito1;
		String stringDigito2;
		int itemSubstring;
		
		for(int i = 0; i < subCodigo.length(); i++) {
			itemSubstring = Character.digit(subCodigo.charAt(i), 10);
			
			digito1 += itemSubstring;
			digito2 *= itemSubstring;
		}
		
		stringDigito1 = String.valueOf(digito1 / 10).substring(0);		
		stringDigito2 = String.valueOf(digito2);
		stringDigito2 = stringDigito2.substring(stringDigito2.length() - 1);
		
		if(stringDigito1.equals(codigo.substring(9, 10)) && stringDigito2.equals(codigo.substring(10))) {
			System.out.println("O digito passou no teste de validação!!");
		}else {
			System.out.println("o digito não passou no teste de validação!!");
		}
		
	}
}


















