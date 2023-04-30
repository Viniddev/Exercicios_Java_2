package exercicio01;
import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String funcionarios[][] = new String[4][3];
		double salario, total = 0, media;
		int dependentes, salariosAltos = 0; 
		
		//input
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite seu nome: ");
			funcionarios[i][0] = sc.next();
			System.out.print("Digite seu salário: ");
			funcionarios[i][1] = sc.next();
			System.out.print("Digite quantos dependentes você possui: ");
			funcionarios[i][2] = sc.next();
			System.out.println("------------------------------------------------");
		}
		
		//processamento
		for(int i = 0; i < 10; i++) {
			salario = Float.valueOf(funcionarios[i][1]).floatValue();
			dependentes = Integer.parseInt(funcionarios[i][2]);
			
			if(salario > 0 && salario < 1000) {
				salario = salario + salario * 0.3;
			}else if(salario < 2000) {
				salario = salario + salario * 0.2;
			}else if(salario >= 2000){
				salario = salario + salario * 0.1;
			}else {
				System.out.print("Erro na análise dos dados");
				salario = 0;
			}
			
			salario = salario + (50*dependentes);
			total += salario;
			
			if (salario > 1700) {
				salariosAltos++;
			}
			funcionarios[i][1] = String.valueOf(salario);
		}
		media = total / 4;
		
		
		//output
		System.out.print("Funcionário | Salário | Dependentes \n");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%s | %s | %s \n", funcionarios[i][0], funcionarios[i][1], funcionarios[i][2]);
		}
		
		System.out.print("------------------------------------------------\n");
		
		System.out.printf("A soma dos salários é RS %.2f \n", total);
		System.out.printf("A média dos salários é RS %.2f \n", media);
		System.out.printf("Existem %d funcionarios que recebem mais de R$1700 \n", salariosAltos);
	}
}
