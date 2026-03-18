import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        double novoSalario = salario * 1.15; // aumento de 15%

        System.out.println("Salário com reajuste: " + novoSalario);

        sc.close();
    }
}