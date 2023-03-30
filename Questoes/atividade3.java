import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade3 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double Fahrenheit, Celsius;
        System.out.println("Iremos transformar a temperatura Fahrenheit em Celsius");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        Fahrenheit = leia.nextDouble();
        Celsius = (Fahrenheit-32)/1.8;
        System.out.print("A temperatura em Celsius é " +df.format(Celsius) +" graus");
        leia.close();
    }
}