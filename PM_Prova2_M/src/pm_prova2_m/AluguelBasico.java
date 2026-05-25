package pm_prova2_m;



public class AluguelBasico extends Aluguel{

    private final int limiteKm = 100;
    private final boolean seguro = false;

    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    
    @Override
    public void exibirDetalhes() {
        System.out.println("Limite KM: " + limiteKm);
        System.out.println("Seguro: " + seguro);
    }

    @Override
    public boolean possuiSeguroIncluso(){
        return false;
    }

}
