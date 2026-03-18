import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DicionarioPrecos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();

        // Adicione alguns produtos
        produtos.put("Arroz", 20.0);
        produtos.put("Feijão", 10.0);
        produtos.put("Macarrão", 5.0);

        System.out.print("Digite o nome do produto para buscar: ");
        String busca = sc.nextLine();

        if (produtos.containsKey(busca)) {
            System.out.println("Preço: " + produtos.get(busca));
        } else {
            System.out.println("Produto não encontrado");
        }

        sc.close();
    }
}