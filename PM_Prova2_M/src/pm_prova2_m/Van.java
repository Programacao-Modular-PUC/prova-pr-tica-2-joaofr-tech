package pm_prova2_m;

public class Van extends Veiculo implements Avaliavel, Inspecionavel{
    
    private int maxPassageiros;
    private int nota;

    public Van(String placa, String modelo, int anoFabricacao,
            double valorDiaria, double quilometragem,
            StatusVeiculo status, int maxPassageiros) {

        super(placa, modelo, anoFabricacao,
                valorDiaria, quilometragem, status);

        this.maxPassageiros = maxPassageiros;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
        System.out.println("Van avaliada com nota " + nota);
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inspeção realizada na van " + getModelo());
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Máx passageiros: " + maxPassageiros);
        System.out.println("Nota: " + nota);
    }

    @Override
    public boolean possuiSeguroEspecial(){
        if (getQuilometragem() > 100){
            return true;
        }
        return false;
    }
}
