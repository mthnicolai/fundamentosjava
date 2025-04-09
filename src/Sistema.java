import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta = 1;

        while (resposta == 1) {
            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto:");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // limpar quebra de linha

            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("---> Nome do produto: " + nome);
            System.out.println("---> Preço do produto: R$" + preco);
            System.out.println("---> Quantidade: " + quantidade);

            System.out.println("Deseja cadastrar mais um produto? (Sim = 1 / Não = 2)");
            resposta = scanner.nextInt();
            scanner.nextLine(); // limpar quebra de linha
        }

        System.out.println("Cadastro finalizado.");
        scanner.close();
        System.out.println("Fim do Programa.");
    }
}
