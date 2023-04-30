package exercicio02;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float lado1, lado2, lado3;

		System.out.print("Digite o primeiro lado: ");
		lado1 = sc.nextFloat();
		System.out.print("Digite o segundo lado: ");
		lado2 = sc.nextFloat();
		System.out.print("Digite o terceiro lado: ");
		lado3 = sc.nextFloat();
		System.out.print("\n------------------------------------------------------- \n\n");
		
		
		if(lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1) {
			System.out.print("Os valores informados não podem formar um triângulo.");
		}else {
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.printf("lado1 = %.2f | lado2 = %.2f | lado3 = %.2f | Tipo: Equilátero", lado1, lado2, lado3);
			}else if(lado1 != lado2 && lado1 != lado3) {
				System.out.printf("lado1 = %.2f | lado2 = %.2f | lado3 = %.2f | Tipo: Escaleno", lado1, lado2, lado3);
			}else {
				System.out.printf("lado1 = %.2f | lado2 = %.2f | lado3 = %.2f | Tipo: Isosceles", lado1, lado2, lado3);
			}
		}
	}
}
