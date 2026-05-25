package pm_prova2_m;

public class AluguelExecutivo {

    private final boolean kmIlimitado = true;
    private final boolean motoristaParticular = true;
    private int nota;

    public void avaliar(int nota) {
        this.nota = nota;
        System.out.println("Aluguel executivo avaliado com nota " + nota);
    }

        
    public void exibirDetalhes() {
        System.out.println("nKM ilimitado: " + kmIlimitado);
        System.out.println("Motorista particular: " + motoristaParticular);
        System.out.println("Nota: " + nota);
    }

    public boolean possuiSeguroIncluso(){
        return true;
    }

}
