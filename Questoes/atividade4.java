import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade4 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double capitalA, juros, montanteR;
        int prazo;
        System.out.println("Iremos calcular os juros compostos da sua aplicação financeira");
        System.out.print("Digite o capital que sera aplicado: ");
        capitalA = leia.nextDouble();
        System.out.print("Qual o prazo da aplicação em meses: ");
        prazo = leia.nextInt();
        System.out.print("Digite a taxa de juros mensais: ");
        juros = leia.nextDouble() / 100;
        montanteR = capitalA*Math.pow((1+juros),prazo);
        System.out.println("O montante á ser recebido é R$" +df.format(montanteR) +" reais");
        leia.close();
    }
}
