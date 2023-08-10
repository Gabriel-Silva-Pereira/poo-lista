import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Digite um inteiro de cinco dígitos: ");
            number = scanner.nextInt();

            if (number >= 10000 && number <= 99999) {
                break;
            } else {
                System.out.println("Número inválido! Por favor, insira um inteiro de cinco dígitos.");
            }
        }

        if (isPalindrome(number)) {
            System.out.println(number + " é um palíndromo.");
        } else {
            System.out.println(number + " não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        int length = numStr.length();

        for (int i = 0; i < length / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
