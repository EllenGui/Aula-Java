import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade7 {
	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double SalarioFixo, TotalVendas, Porcent, SalarioTotal;
        System.out.println("Iremos calcular seu salario total");
        System.out.print("Digite seu salario fixo: ");
        SalarioFixo = leia.nextDouble();
        System.out.print("Digite o valor total das vendas desse mês: ");
        TotalVendas = leia.nextDouble();
        System.out.print("Digite a percentual ganho por venda: ");
        Porcent = leia.nextDouble();
        SalarioTotal = SalarioFixo + (TotalVendas*Porcent/100);
        System.out.println("Seu salario total é R$" +df.format(SalarioTotal));
        leia.close();
    }
}
