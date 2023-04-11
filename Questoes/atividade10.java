import java.util.Scanner;
import java.text.DecimalFormat;


public class atividade10 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double n1, n2, n3, aritimetica, harmonica, geometrica;
        System.out.println("Iremos lhe dar as médias aritimética, harmônica e geométrica dos números digitados.");
        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = leia.nextDouble();
        System.out.print("Digite o terceiro número: ");
        n3 = leia.nextDouble();
        aritimetica = (n1+n2+n3) / 3;
        harmonica = 3 / ((1/n1)+(1/n2)+(1/n3));
        geometrica = Math.cbrt(n1*n2*n3); //math.cbrt significa raiz cubida do número que tiver em parentese
        System.out.println("A média aritimètica desses números é " +df.format(aritimetica));
        System.out.println("A média harmõnica desses números é " +df.format(harmonica));
        System.out.println("A média geométrica desses números é " +df.format(geometrica));
        leia.close();
    }
    
}
