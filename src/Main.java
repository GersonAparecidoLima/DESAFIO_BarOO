import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a entrada do usuário
        char gender;
        int beer, barbecue, softDrink;

        // Solicita e lê o gênero com validação
        while (true) {
            System.out.print("Sexo: ");
            gender = scanner.next().toUpperCase().charAt(0);

            if (gender == 'M' || gender == 'F') {
                break;
            } else {
                System.out.println("Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.");
            }
        }

        // Solicita e lê a quantidade de cervejas
        System.out.print("Quantidade de cervejas: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro para a quantidade de cervejas.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Quantidade de cervejas: ");
        }
        beer = scanner.nextInt();

        // Solicita e lê a quantidade de refrigerantes
        System.out.print("Quantidade de refrigerantes: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro para a quantidade de refrigerantes.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Quantidade de refrigerantes: ");
        }
        softDrink = scanner.nextInt();

        // Solicita e lê a quantidade de churrasco
        System.out.print("Quantidade de espetinhos: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro para a quantidade de espetinhos.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print("Quantidade de espetinhos: ");
        }
        barbecue = scanner.nextInt();

        // Cria uma instância da classe Bill com os dados fornecidos
        Bill bill = new Bill(gender, beer, barbecue, softDrink);

        // Calcula e exibe o resultado
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo: R$ %.2f\n", bill.feeding());

        if (bill.cover() == 0.0) {
            System.out.println("Couvert: Isento de Couvert");
        } else {
            System.out.printf("Couvert: R$ %.2f\n", bill.cover());
        }

        System.out.printf("Ingresso: R$ %.2f\n", bill.ticket());
        System.out.println(" ");
        
        System.out.printf("Valor a pagar: R$ %.2f\n", bill.total());

        // Fecha o Scanner
        scanner.close();
    }
}
