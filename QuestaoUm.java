import java.util.Scanner;

public class QuestaoUm {
    
    public static void main(String[] args) {

        System.out.println("Questão um, prova A1.");

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a placa do veículo:");
        String placaVeiculo = scan.nextLine();

        System.out.println("Informe o valor do litro do combustível:");
        double valorCombustivel = scan.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 60 KM/H:");
        double sessentaPorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 80 KM/H:");
        double oitentaPorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 100 KM/H:");
        double cemPorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 120 KM/H:");
        double centoEVintePorHora = scan.nextDouble();

        System.out.println("Informe a quantidade de quilômetros rodados a 140 KM/H:");
        double centoEQuarentaPorHora = scan.nextDouble();

        double consumosessentaPorHora = (sessentaPorHora / 30.7);
        double consumoOitentaPorHora = (oitentaPorHora / 26.8);
        double consumoCemPorHora = (cemPorHora / 22.4);
        double consumoCentoEVintePorHora = (centoEVintePorHora / 18.1);
        double consumoCentoEQuarentaPorHora = (centoEQuarentaPorHora / 14.5);

        double consumoTotal = (consumosessentaPorHora + consumoOitentaPorHora + consumoCemPorHora
                + consumoCentoEVintePorHora + consumoCentoEQuarentaPorHora);

        double mediaPoderada = ((sessentaPorHora * 60) + (oitentaPorHora * 80) + (cemPorHora * 100)
                + (centoEVintePorHora * 120) + (centoEQuarentaPorHora * 140))
                / (sessentaPorHora + oitentaPorHora + cemPorHora + centoEVintePorHora + centoEQuarentaPorHora);

        double custoTotal = (consumoTotal * valorCombustivel);

        System.out.printf("Placa do veículo: %s", placaVeiculo);
        System.out.printf("\nConsumo total: %.4f litros", consumoTotal);
        System.out.printf("\nValor total: R$ %.2f", custoTotal);
        System.out.printf("\nVelocidade média ponderada: %.4f Km/h", mediaPoderada);

        scan.close();
    }
}
