import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Digite o desconto (%): ");
        double desconto = sc.nextDouble();

        double novoPreco = preco - (preco * desconto / 100);

        System.out.println("Preço com desconto: " + novoPreco);

        sc.close();
    }
}