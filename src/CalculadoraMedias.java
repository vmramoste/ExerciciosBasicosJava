public class CalculadoraMedias {
    static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite o número 1: ");
        double nota1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o número 2: ");
        double nota2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite o número 3: ");
        double nota3 = Double.parseDouble(scanner.nextLine());

        double media = (nota1+nota2+nota3)/3;
        System.out.println(media);
    }
}