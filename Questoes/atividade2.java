import java.util.Scanner;


public class atividade2 {
    public static void main (String[] args){ 
        
        Scanner leia = new Scanner(System.in);
        double valor, valorNovo, acressimo;
        System.out.println("Insira o valor do produto para que seja calculado seu novo valor a partir do acressimo");
        System.out.println("Insira o valor do produto:");
        valor = leia.nextDouble();
        acressimo = 10/100; //10%
        valorNovo = valor*acressimo;
        System.out.println("O novo valor do produto é" +valorNovo);
        leia.close();
    }
}