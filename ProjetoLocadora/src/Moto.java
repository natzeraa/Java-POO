// Novo atributo -> Cilindrada
// Se a cilindrada for > 300 -> acrescimo de 15%

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int cilindradas) {
        super(marca, modelo, ano, placa, precoBase);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularDiaria() {
        if (cilindradas >= 300) {
            return getPrecoBase() * 1.15;
        }
        return getPrecoBase();
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + " " + cilindradas + "cc";
    }

}