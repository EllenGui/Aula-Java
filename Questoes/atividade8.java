//Duvida-Resposta certa do professor
import java.util.Scanner;

public class atividade8 {

	public static void main(String[] args) {

		int totalVeiculo, totalRoda, totalCarro, totalMoto;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Programa - Controle de Veículos Estacionamento");
		System.out.println("Informe o total de veículos no estacionamento: ");
		totalVeiculo = scanner.nextInt();

		System.out.println("Informe o total de rodas no estacionamento: ");
		totalRoda = scanner.nextInt();

		totalMoto = ((4 * totalVeiculo) - totalRoda) / 2;
		totalCarro = totalVeiculo - totalMoto;

		System.out.printf("\nO estacionamento possui: %d carro's e %d moto's.", totalCarro, totalMoto);
		scanner.close();
	}
}
