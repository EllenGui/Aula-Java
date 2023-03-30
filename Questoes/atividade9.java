import java.util.Scanner;


public class atividade9 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int segundosI, horas, minutos, segundosF;
        System.out.println("Algoritmo de calculo de horas");
        System.out.print("Digite os segundos: ");
        segundosI = leia.nextInt();
        horas = segundosI / 36000;
        minutos = (segundosI % 3600) / 60;
        segundosF = segundosI % 60;
        System.out.print("Convertendo para horas, minutos e segundos: " +horas +"h " +minutos +"m " +segundosF +"s ");
        leia.close();
    }
}
