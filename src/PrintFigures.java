public class PrintFigures {
    public static void main(String[] args) {
        // Desenhar a figura A
        System.out.println("Figura A:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Desenhar a figura B
        System.out.println("\nFigura B:");
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.print("*"); // Na figura B termina com ** no final
            System.out.println();
        }

        // Desenhar a figura C
        System.out.println("Figura C:");
        for (int i = 10; i >= 1; --i) {
            // Imprimir espaços antes da coluna de *
            for (int j = 1; j <= 10 - i; ++j) {
                System.out.print(" ");
            }

            // Imprimir a coluna de *
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Desenhar a figura D
        System.out.println("Figura D:");
        for (int i = 1; i <= 10; ++i) {
            // Imprimir espaços antes da coluna de *
            for (int j = 1; j <= 10 - i; ++j) {
                System.out.print(" ");
            }

            // Imprimir a coluna de *
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
