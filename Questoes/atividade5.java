import java.util.Scanner;


public class atividade5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double HorasTrab, ValorHora, SalarioF, SalarioBruto, SalarioFnovo;
		int Filhos;
		System.out.println("Neste programa iremos calcular o valor do seu salário bruto recebido no mês.");
		System.out.print("Informe as horas trabalhadas por mês: ");
		HorasTrab = leia.nextDouble();
		System.out.print("Informe o valor recebido por hora: ");
		ValorHora = leia.nextDouble();
		System.out.print("Informe o número de filhos com idade menor de 14 anos: ");
		Filhos = leia.nextInt();
		SalarioF = 59.82;
		SalarioFnovo = SalarioF*Filhos;
		SalarioBruto = (HorasTrab*ValorHora)+(SalarioFnovo);
		System.out.print("O salario bruto é R$" +SalarioBruto);
		leia.close();
	}
}