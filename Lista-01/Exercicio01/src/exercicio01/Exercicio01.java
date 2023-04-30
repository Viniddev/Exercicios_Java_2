package exercicio01;
import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[3];
		float media = 0;
		String situacao = "";
		
		System.out.print("Digite a primeira nota: ");
		notas[0] = sc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		notas[1] = sc.nextFloat();
		System.out.print("Digite a terceira nota: ");
		notas[2] = sc.nextFloat();
		System.out.print("\n-------------------------------------------------------\n\n");
		
		
		media = (notas[0] + notas[1] + notas[2]) / 3;
		
		
		if(media >= 0 && media < 4) {
			situacao = "reprovado";
			System.out.printf("A média do aluno foi %.2f e a situação é: %s", media, situacao);
		}else if(media < 7) {
			situacao = "recuperação";
			System.out.printf("A média do aluno foi %.2f e a situação é: %s", media, situacao);
		}else if(media <= 10) {
			situacao = "Aprovado";
			System.out.printf("A média do aluno foi %.2f e a situação é: %s", media, situacao);
		}else {
			System.out.printf("Erro na análise das notas (media > 10)");
		}
	}
}
