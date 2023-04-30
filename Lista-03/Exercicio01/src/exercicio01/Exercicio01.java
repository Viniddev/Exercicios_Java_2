package exercicio01;
import java.util.*; 

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cidades[] = new String[20];
		float distancias[] = new float[20];
		int flag;
		String consulta;
		String cidade;
		int numBusca = 0;
		boolean encontrou;
		float totalPassagem;
		float totalParadas;
		float totalTempo;
		
		//input
		for(int cont = 0; cont < 20; cont++) {
			do {
				System.out.print("Digite o nome da cidade: ");
				cidade = sc.nextLine().toUpperCase();
				
				if(cidade.equals("")) {
					System.out.println("O nome da cidade não pode ser nulo!!");
				}else{
					cidades[cont] = cidade;
					cidade = " ";
				}
			} while(cidade.equals(""));
			
			
			//
			
			do {
				System.out.print("Qual a distância até BH:");
				distancias[cont] = sc.nextFloat();
				
				if(distancias[cont] < 500) {
					System.out.println("A distância até bh não pode ser menor que 500km!!");
				}
			} while(distancias[cont] < 500);
			
			//
			System.out.println("------------------------------------------------------");
			
			do {
				System.out.print("Deseja continuar cadastrando? [0 = não // 1 = sim] ");
				flag = sc.nextInt();
				
				if(flag > 1 || flag < 0) {
					System.out.println("Digite uma opção válida!!");
				}
			} while(flag > 1 || flag < 0);
			
			sc.nextLine();
			
			if(flag == 0) {
				break;
			}
			System.out.println("------------------------------------------------------");
		}
		
		//output
		
		System.out.println("MODO BUSCADOR");
		do {
			System.out.print("Para onde deseja viajar? [sair = break] ");
			consulta = sc.nextLine().toUpperCase();
			
			if(consulta.equals("SAIR")) {
				System.out.println("Fim do programa! Obrigado por usar nossos serviços");
				break;
				
			}
			
			encontrou = false;
			
			for (numBusca = 0; numBusca < 20; numBusca++){
				if (consulta.equals(cidades[numBusca])){
					encontrou = true;
					break;
				}
			}
			
			//calculo + output
			if (encontrou) {
				totalTempo = (distancias[numBusca]/800) * 60;
				totalParadas = (int) (totalTempo / 180);
				totalPassagem = (float) (distancias[numBusca] * 0.25);
				
				System.out.println("------------------------------------------------------");
				System.out.println(cidades[numBusca] + " encontrado na posição " + numBusca + " do vetor!");
				System.out.println("Passagem: "+totalPassagem+"R$ | Tempo de voo:"+totalTempo+"Minutos | Total de paradas:"+totalParadas);
				System.out.println("------------------------------------------------------");
			}else{
				System.out.println("O Nome digitado NÃO FOI ENCONTRADO NO VETOR !");
			}
			
		} while(!consulta.equalsIgnoreCase("sair"));
		
		
	}
}
