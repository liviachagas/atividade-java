import java.util.Scanner;

public class AnalisadorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Quantidade de caracteres: " + frase.length());
        System.out.println("Tipo do dado: String");

        sc.close();
    }
}