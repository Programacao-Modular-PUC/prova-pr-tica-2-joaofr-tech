package pm_prova2_m;

public class Carro extends Veiculo implements Avaliavel{

    private int quantidadePortas;
    private int nota;

    public Carro(String placa, String modelo, int anoFabricacao,
                double valorDiaria, double quilometragem,
                StatusVeiculo status, int quantidadePortas) {

        super(placa, modelo, anoFabricacao,
                valorDiaria, quilometragem, status);

        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void avaliar(int nota) {
        this.nota = nota;
        System.out.println("Carro avaliado com nota " + nota);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Portas: " + quantidadePortas);
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
