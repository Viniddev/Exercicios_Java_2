package exercicio03;
import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = 1, pecasFabricadas= 0, totalPecas = 0, menosPecas = 1000, operarioImprodutivo = 0, operariosClasseB = 0;
		String classeOperario = " ";
		float totalSalarios=0, mediaPecasClasseB=0, salario=0;
		

		while(codigo != 0){	
			System.out.print("Digite o código de operário [0 = stop]: ");
			codigo = sc.nextInt();
			if(codigo != 0) {
				do {
					System.out.print("Digite qual sua classe: ");
					classeOperario = sc.next().toUpperCase();
					
					if(!classeOperario.equals("A") && !classeOperario.equals("B") && !classeOperario.equals("C")) {
						System.out.println("Dados inválidos para classe! " + classeOperario);
					}
				}while(!classeOperario.equals("A") && !classeOperario.equals("B") && !classeOperario.equals("C"));
				
				
				do {
					System.out.print("Quantas peças você fabricou no mês: ");
					pecasFabricadas = sc.nextInt();
					
					if(pecasFabricadas <= 0) {
						System.out.println("Dados inválidos para quantidade de peças! " + pecasFabricadas);
					}
				}while(pecasFabricadas <= 0);
			
				//processamento
				if(classeOperario.equals("A")) {
					if(pecasFabricadas <= 30) {
						salario = 500 + (2*pecasFabricadas);
					}else if(pecasFabricadas <= 40) {
						salario = (float) (500 + (2.30 * pecasFabricadas));
					}else {
						salario = (float) (500 + (2.80 * pecasFabricadas));
					}
				}else if(classeOperario.equals("B")) {
					salario = 1200;
					mediaPecasClasseB += pecasFabricadas;
					operariosClasseB += 1;
				}else {
					if(pecasFabricadas<=50) {
						salario = 40 * pecasFabricadas;
					}else {
						salario = 45 * pecasFabricadas; 
					}
				}
					
				if(pecasFabricadas < menosPecas) {
					menosPecas = pecasFabricadas;
					operarioImprodutivo = codigo;
				}
				
				totalSalarios += salario;
				totalPecas += pecasFabricadas;
				
				System.out.println("------------------------------------------------");
				System.out.println("Operário: "+ codigo +" Classe: "+classeOperario+" Salário: R$"+ salario);
				System.out.println("------------------------------------------------");
			}	
		}
		
		mediaPecasClasseB = mediaPecasClasseB / operariosClasseB;
		
		
		//output
		System.out.println("------------------------------------------------");
		System.out.println("O total gasto pela empresa com salários é: " + totalSalarios);
		System.out.println("O total de peças fabricadas no mês foi de: " + totalPecas);
		System.out.println("O operário que fabricou menos peças foi o: " + operarioImprodutivo);
		System.out.println("O operário menos produtivo produziu "+menosPecas+" pecas");
		System.out.println("Media de peças fabricadas por operarios classe B: " + mediaPecasClasseB);
	}
}
