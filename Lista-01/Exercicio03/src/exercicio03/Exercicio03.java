package exercicio03;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float salario;
		double salarioAjustado, valeTransporte = 0;
		int tempoDeCasa = 0;
		
		System.out.println("-------------------------------------------------------");
		System.out.println("     Empresa ABCDário. Sempre trabalhando por você ");
		System.out.println("-------------------------------------------------------");
		System.out.print("Há quantos anos você trabalha na empresa? ");
		tempoDeCasa = sc.nextInt();
		System.out.print("Qual o valor do seu salário? ");
		salario = sc.nextFloat();
		
		
		if(tempoDeCasa >= 0 && tempoDeCasa <= 5) { 
			if(salario > 0 && salario <= 300) {
				salarioAjustado = salario + 50;
				valeTransporte = salarioAjustado * 0.05;
			}else{
				salarioAjustado = salario + 80;
				valeTransporte = salarioAjustado * 0.06;
			}
		}else if(tempoDeCasa <= 10) {
			if(salario <= 500) {
				salarioAjustado = salario + salario * 0.15;
				valeTransporte = 70;
			}else if(salario > 500 && salario <= 2000 ) {
				salarioAjustado = salario + salario * 0.13;
				valeTransporte = 90;
			}else{
				salarioAjustado = salario + salario * 0.12;
				valeTransporte = salarioAjustado * 0.08;
			}
		}else{
			salarioAjustado = salario + 300;
			valeTransporte = salarioAjustado * 0.04;
		}
		salarioAjustado -= valeTransporte;
		
		
		System.out.println("-------------------------------------------------------");
		System.out.printf("Oferecemos ao cliente que trabalha a %d anos e recebe R$ %.2f por mes: \n\n", tempoDeCasa, salario);
		System.out.printf("Reajuste no valor do vale transporte para R$ %.2f \n", valeTransporte);
		System.out.printf("Reajuste no valor do Salário para R$ %.2f \n", salarioAjustado);
		
		System.out.println("-------------------------------------------------------");
		
	}
}
