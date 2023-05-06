import java.util.*;
public class GeradorDeLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String login;
		String senha;
		
		for(int i = 0; i < 30; i++) {
			//verificar se digitou apenas numeros
			try {
				System.out.print("Digite o seu nome: ");
				nome = sc.nextLine();
			}catch(NumberFormatException e) {
				System.out.println("Digite um nome sem numeros;");
			}
			
			//flag
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			
			//removendo espaços a esqueda e a direita
			nome = nome.trim();
			
			
			//verifica se tem numeros
			boolean temNumeros = false;
			do {
				temNumeros = false;
				for(int c = 0; c < nome.length(); c++) {
					if(nome.charAt(c) < 41 || nome.charAt(c) > 90 || nome.charAt(c) < 61 || nome.charAt(c) > 122) {
						temNumeros = true;
						break;
					}
				}
				
				if(temNumeros) {
					System.out.print("digite um nome válido com apenas letras: ");
					nome = sc.nextLine();
				}
			} while(!temNumeros);
			
			
			//menos de 15 caracteres
			while(nome.length() < 15) {
				System.out.println("digite um nome com mais de 15 caracteres! ");
				System.out.print("nome: ");
				nome = sc.nextLine();
			}
			
			//verifica se existe sobrenome
			while(nome.indexOf(" ") == -1) {
				System.out.println("é necessário que exista pelo menos um nome e um sobrenome! ");
				System.out.print("nome: ");
				nome = sc.nextLine();
			}
			
			//cria login
			login = criaLogin(nome);
			senha = criaSenha(login);
			
			System.out.println("login: "+ login + " | senha: " + senha);
			System.out.println("--------------------------------------------------------------");
		}
	}
	
	public static String criaLogin(String nomeUsuario) {
		String login="";
		for(int i = 0; i < nomeUsuario.length(); i++) {
			if(i == 0) {
				login += nomeUsuario.substring(i, i+1);
			}
			if((nomeUsuario.substring(i, i+1)).equals(" ")) {
				login += nomeUsuario.substring(i+1, i+2);
			}
		}
		return login;
	}
	
	public static String criaSenha(String loginUsuario) {
		String senha = "";
		
		for(int i = 0; i < loginUsuario.length(); i++) {
	
			senha += String.valueOf((((int)loginUsuario.charAt(i)))).substring(0, 1);
		}
		
		return senha;
	}
}
