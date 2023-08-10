import java.util.Scanner;

public class FatorialCalculator {

    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um inteiro não negativo: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("O número deve ser não negativo.");
            } else {
                int resultado = calcularFatorial(n);
                System.out.println("O fatorial de " + n + " é " + resultado);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número inteiro não negativo.");
        }
    }
}
