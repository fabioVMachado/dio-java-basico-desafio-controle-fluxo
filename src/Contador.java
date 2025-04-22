import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2º número inteiro: ");
        int num2 = scanner.nextInt();

        scanner.close();

        try {
            validarParametros(num1, num2);
            int quantidadeIteracoes = num2 - num1;
            realizarContagem(quantidadeIteracoes);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
}

static void validarParametros(int num1, int num2) throws ParametrosInvalidosException {
    if (num1 > num2) {
        throw new ParametrosInvalidosException("O 1° número deve ser menor que o 2° número.");
    }
}

static void realizarContagem(int iteracoes) {
    for (int i = 1; i <= iteracoes; i++) {
        System.out.println("Imprimindo o número: " + i);
    }
}
}