package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//armazenamento
		Scanner sc = new Scanner(System.in);
		String sexo = " ";
		String sexoMasculino = "M";
		String sexoFeminino = "F";
		float altura = 0, maiorAltura = 0, menorAltura = 3, mediaMasculina = 0, mediaGeral = 0;
		int flag = 1, atletasFemininas = 0, atletasMasculinos = 0;
		
		
		//input
		while(flag != 0){	
			do {
				System.out.print("Digite qual a altura do atleta: ");
				altura = sc.nextFloat();
				
				if(altura <= 0 || altura >= 3) {
					System.out.println("Dados inválidos para altura!");
				}
			} while(altura <= 0 || altura >= 3);
			
			
			do {
				System.out.print("Digite qual o sexo do atleta [F/M]: ");
				sexo = sc.next().toUpperCase();
				
				if(!sexo.equals(sexoMasculino) && !sexo.equals(sexoFeminino)) {
					System.out.println("Dados inválidos para sexo! " + sexo);
				}
			}while(!sexo.equals(sexoMasculino) && !sexo.equals(sexoFeminino));
			
			
			do {
				System.out.print("Deseja continuar cadastrando? [0 = não // 1 = sim] ");
				flag = sc.nextInt();
				
				if(flag < 0 || flag > 1) {
					System.out.println("Dados inválidos para altura!");
				}
			} while(flag < 0 || flag > 1);
			
			
			//processamento
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}else if(altura < menorAltura) {
				menorAltura = altura;
			}
			
			if(sexo.equals(sexoFeminino)) {
				atletasFemininas += 1;
			}
			
			if(sexo.equals(sexoMasculino)) {
				mediaMasculina += altura;
				atletasMasculinos ++;
			}
			
			mediaGeral += altura;
			System.out.println("------------------------------------------------");
		}
		mediaMasculina = mediaMasculina / atletasMasculinos;
		mediaGeral = mediaGeral / (atletasMasculinos+atletasFemininas);
		
		//output
		System.out.println("------------------------------------------------");
		System.out.println("A maior altura encontrada foi: " + maiorAltura);
		System.out.println("A menor altura encontrada foi: " + menorAltura);
		System.out.println("O número de atletas do sexo feminino: " + atletasFemininas);
		System.out.println("O número de atletas do sexo masculino: " + atletasMasculinos);
		System.out.println("A media de altura Masculina foi: " + mediaMasculina);
		System.out.println("A media de altura Geral foi: " + mediaGeral);
		
		
	}
}
