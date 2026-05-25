package pm_prova2_m;

public class AluguelPremium extends Aluguel{

    private final boolean kmIlimitado = true;
    private final boolean seguro = true;

    public AluguelPremium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

        
    @Override
    public void exibirDetalhes() {
        System.out.println("KM ilimitado: " + kmIlimitado);
        System.out.println("Seguro: " + seguro);
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return true;
    }
}
