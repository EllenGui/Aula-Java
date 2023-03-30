import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade6 {
	public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        float n1, baseN2;
        double log;
        System.out.println("Iremos lhe dizer o logaritmo do número 1 na base do número 2");
        System.out.print("Digite o primeiro número:");
        n1 = leia.nextFloat();
        System.out.print("Digite o segundo número:");
        baseN2 = leia.nextFloat();
        log = Math.log(n1)/Math.log(baseN2);
        System.out.print("O logaritmo do " +n1 +" na base " +baseN2 +" é " +df.format(log));
        leia.close();
    }
}

