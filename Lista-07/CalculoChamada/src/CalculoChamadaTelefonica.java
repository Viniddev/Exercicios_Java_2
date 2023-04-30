import java.util.*;
public class CalculoChamadaTelefonica {

	static int horaInicio, horaFim;
	static int minInicio, minFim;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String horarioInicial;
		String horarioFinal;
		boolean horaValida;
		String flag;
		
		do {
			
			do {
				horaValida = true;
				System.out.println("Digite a hora de inicio da chamada: ");
				horarioInicial = sc.nextLine();
				System.out.println("Digite a hora final da chamada: ");
				horarioFinal = sc.nextLine();
				
				horaValida = validarFaixaHoraria(horarioInicial, horarioFinal);
			} while(!horaValida);
			
			calculoContaTelefonica(horarioInicial, horarioFinal);
			
			System.out.println("Deseja continuar cadastrando? [s / n]");
	 		flag = sc.nextLine();
			
			if(flag.equalsIgnoreCase("N")) {
				System.out.println("FIM");
				break;
			}
			
		} while(true);
	}
	
	public static boolean validarFaixaHoraria(String inicio, String fim) {
		boolean validator = true;
		
		horaInicio  = Integer.parseInt(inicio.substring(0, 2));
		horaFim = Integer.parseInt(fim.substring(0, 2));
		minInicio = Integer.parseInt(inicio.substring(3));
		minFim = Integer.parseInt(fim.substring(3));
		
		if(horaInicio < 0 || horaInicio > 23 || horaFim < 0 || horaFim > 23 || minInicio < 0 || minInicio > 59 || minFim < 0 || minFim > 59) {
			System.out.println("Valores acima de 23h, favor digitar uma faixa horaria valida");
			validator = false;
		}else if(horaInicio > horaFim) {
			System.out.println("Hora final maior que a hora inicial. Digite um valor valido");
			validator = false;
		}
		
		return validator;
	}
	public static void calculoContaTelefonica(String inicio, String fim) {
		float valInicial = 0;
		float valorTotalConta;
		
		if(horaInicio > 0 && horaInicio < 6) {
			valInicial = (float) 0.10;
		}else if(horaInicio < 8) {
			valInicial = (float) 0.15;
		}else if(horaInicio < 18) {
			valInicial = (float) 0.20;
		}else if(horaInicio < 8) {
			valInicial = (float) 0.15;
		}
		
		valorTotalConta =((horaFim - horaInicio) * 60 + minFim - minInicio) * valInicial;
		
		System.out.println("O valor da conta é: R$"+ valorTotalConta);
	}
}









