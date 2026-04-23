import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<Veiculo> frota;

    public Locadora(){
        this.frota = new ArrayList<>();
    }

    public void addVeiculo(Veiculo veiculo){
        frota.add(veiculo);
    }

    public List<Veiculo> getFrota(){
        return frota;
    }

    public void listarVeiculo(){
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);

            System.out.printf("[%d] %s | Diária: R$%.2f\n", (i + 1), v.exibirDados(), v.calcularDiaria());
        }
        System.out.println("===========================");
    }

    public void aluguelVeiculo(int dias, int idVeiculo){

        // Implementar a lógica para alugar carro/moto.
        Veiculo v = frota.get(idVeiculo);

        double total = v.calcularDiaria() * dias;

        System.out.println(" ===== RESUMO DO ALUGUEL ====");
        System.out.println("Veículo: " + v.exibirDados());
        System.out.println("Período: " + dias + " dias");
        System.out.printf("Valor diário: R$%.2f", v.calcularDiaria());
        System.out.printf("\nTotal: R$%.2f", total);
    }

}