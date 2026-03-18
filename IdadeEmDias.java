import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        int dias = idade * 365;

        System.out.println("Olá " + nome + ", você já viveu aproximadamente " + dias + " dias.");

        sc.close();
    }
}