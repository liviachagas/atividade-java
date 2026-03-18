import java.util.Scanner;

public class ConversorMedidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Centímetros: " + centimetros);
        System.out.println("Milímetros: " + milimetros);

        sc.close();
    }
}