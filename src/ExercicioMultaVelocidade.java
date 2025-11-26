/*
* Exercício:
* Receber uma velocidade para o veículo. Se acima de 100 km/h, para a velocidade considerada deve haver um
* acréscimo de 10%. Se até 100 km/h, na velocidade considerada deve-se somar 7.
* Para cada km/h da velocidade considerada acima da máxima, a multa é de 10 Reais.
* */
public class ExercicioMultaVelocidade {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int velocidadeMaxima = 90;
        double velocidadeVeiculo, velocidadeConsiderada;
        double valorMulta;
        System.out.println("Qual a velocidade do veículo? ");
        velocidadeVeiculo = scanner.nextDouble();
        // Calcular a velocidade considerada.
        if(velocidadeVeiculo > 100){
            velocidadeConsiderada = velocidadeVeiculo * 1.1;
        }else{
            velocidadeConsiderada = velocidadeVeiculo + 7;
        }
        // Calcular o valor da multa, apenas em caso em que haja multa.
        if(velocidadeConsiderada > velocidadeMaxima){
            valorMulta = (velocidadeConsiderada - velocidadeMaxima) * 10; // 10 Reais a multa por km/h acima do máximo
            System.out.println("Você foi multado. O valor da multa é de " + String.format("%.2f", valorMulta) + " Reais.");
        }else{
            System.out.println("Você não foi multado.");
        }
        scanner.close();
    }
}
