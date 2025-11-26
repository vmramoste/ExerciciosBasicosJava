/*
* Receba uma quantidade variável de notas e faça a média delas.
* Quando o usuário entrar com um valor vazio, pare de receber notas e imprima o resultado.
* */

public class CalculadoraMedias2 {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int quantidadeNotas = 0;
        double somaNotas = 0;
        System.out.println("Calculadora de médias!");
        while(true){
            System.out.println("Digite a nota: ");
            String notaEntrada = scanner.nextLine();
            if(notaEntrada.equals("")){
                break;
            }
            quantidadeNotas++;
            somaNotas += Double.parseDouble(notaEntrada);
        }
        if(quantidadeNotas > 0){
            double media = somaNotas/quantidadeNotas;
            System.out.println("A média final, com " + quantidadeNotas + " notas é: " + media);
        }
        scanner.close();
    }
}
