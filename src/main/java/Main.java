import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numeroTabuada = scanner.nextInt();

        System.out.print("Começar por: ");
        int inicioTabuada = scanner.nextInt();

        System.out.print("Terminar em: ");
        int fimTabuada = scanner.nextInt();

        if (fimTabuada < inicioTabuada) {
            System.out.println("O valor final deve ser maior ou igual ao valor inicial.");
        } else {
            System.out.println("Vou montar a tabuada de " + numeroTabuada + " começando em " + inicioTabuada +
                    " e terminando em " + fimTabuada + ":");

            for (int i = inicioTabuada; i <= fimTabuada; i++) {
                int resultado = numeroTabuada * i;
                System.out.println(numeroTabuada + " X " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}
