public class CalculadoraMedias2 {
    static void main(String[] args) {
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
        double media = somaNotas/quantidadeNotas;
        System.out.println("A média final, com " + quantidadeNotas + " notas é: " + media);
    }
}
