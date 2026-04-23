public class Carro extends Veiculo {

    private int qtdPortas;

    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int qtdPortas){
        super(marca, modelo, ano, placa, precoBase);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public double calcularDiaria(){
        // Carros com 4 portas terão acrescimo de 20%
        if (qtdPortas >= 4){
            return getPrecoBase() * 1.20;
        }
        return getPrecoBase();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " " + qtdPortas + " portas";
    }

}