import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Carro carro1 = new Carro("Porsche", "Cayenne", 2027, "ABC1B34", 2350, 4);
//        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "DYG-2146", 190, 1000);

//        System.out.println(carro1.exibirDados());
//        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();

        locadora.addVeiculo(new Carro("Toyota", "Corolla", 2023, "ABC-123", 480, 4));
        locadora.addVeiculo(new Carro("Honda", "Civic", 2022, "DEF-456", 520, 4));
        locadora.addVeiculo(new Carro("Chevrolet", "Onix", 2021,"GHI-789", 220, 4));

        locadora.addVeiculo(new Moto("Honda", "Biz", 2022,"JKL-987", 100, 110));
        locadora.addVeiculo(new Moto("Yamaha", "Factor", 2023,"MNO-654", 130, 150));
        locadora.addVeiculo(new Moto("Suzuki", "Yes", 2021, "PQR-321", 140, 125));

        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o veículo de 1 a " + tamanho + ": ");
        int veiculoSelecionado = sc.nextInt();

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();

        locadora.aluguelVeiculo(dias, (veiculoSelecionado - 1));

    }
}