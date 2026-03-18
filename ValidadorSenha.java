import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "python123";

        while (true) {
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        sc.close();
    }
}