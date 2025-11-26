/*
* Exercício:
* Receber um valor. Se esse valor for:
* Par: Recebe ele mesmo somado com 5
* Ímpar: Recebe ele mesmo multiplicado por 2
* */

public class ExercicioAtribuicao {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int numero;

        System.out.println("Digite o número: ");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {
            numero += 5;
        } else {
            numero *= 2;
        }
        System.out.println("O número final é " + numero);
        scanner.close();
    }
}
