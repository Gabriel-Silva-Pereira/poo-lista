import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de valores a serem inseridos: ");
        int numValues = scanner.nextInt();

        if (numValues <= 0) {
            System.out.println("Número inválido. O número de valores deve ser maior que zero.");
            scanner.close();
            return;
        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= numValues; i++) {
            System.out.print("Digite o valor #" + i + ": ");
            int value = scanner.nextInt();
            if (value < smallest) {
                smallest = value;
            }
        }

        System.out.println("O menor valor inserido é: " + smallest);

        scanner.close();
    }
}
