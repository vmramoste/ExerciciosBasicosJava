/*
* Receber um número e, com base nele, retornar o dia da semana.
* Utilizar switch
* */

public class DiaDaSemana {
    static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int opcao = -1;
        System.out.println("Digite o número: ");
        opcao = scanner.nextInt();
       /*
        //Verificar opção usando switch
        switch (opcao){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");

        }

        */

        //Opção com switch expressions
        String dia = switch (opcao){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Inválido";

        };
        System.out.println(dia);
    }
}
