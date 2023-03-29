import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero1, numero2, media;
        System.out.println("Iremos calcular a média aritimética dos 2 números que desejar");
        System.out.println("Escreva um numero:");
        numero1 = leia.nextDouble();
        System.out.println("Escreve outro numero:");
        numero2 = leia.nextDouble();
        media = ((numero1 + numero2) / 2);
        System.out.println("A média aritimética desses números é " + media);
        leia.close();
    }
}