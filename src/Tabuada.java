/*
* Tabuada do 1 ao 10 do número fornecido pelo usuário
* */

public class Tabuada {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite o número para a realização da tabuada: ");
        int numero = scanner.nextInt();

        //Tabuada
        for(int i = 1; i<=10; i++){
            int resultado = i * numero;
            System.out.println(numero + " X " + i +" = " + resultado);
        }
        scanner.close();
    }
}
