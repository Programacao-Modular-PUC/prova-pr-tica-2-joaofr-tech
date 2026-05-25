/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
    
        List<Veiculo> veiculos = new ArrayList<>();
        List<Aluguel> alugueis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro(
            "ABC1234",
            "Civic",
            2020,
            250,
            50000,
            StatusVeiculo.DISPONIVEL,
            4
        );

        Moto moto = new Moto(
                "DEF5678",
                "XRE 300",
                2021,
                120,
                20000,
                StatusVeiculo.MANUTENCAO,
                300
        );

        Van van = new Van(
                "GHI9012",
                "Sprinter",
                2019,
                450,
                80000,
                StatusVeiculo.DISPONIVEL,
                15
        );

        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(van);

        
        int opcao;

        do {

            System.out.println("\n===== SISTEMA LOCADORA =====");
            System.out.println("1 - Exibir veículos");
            System.out.println("2 - Exibir alugueis");
            System.out.println("3 - Exibir veículos disponíveis");
            System.out.println("4 - Avaliar veículos");
            System.out.println("5 - Realizar inspeções");
            System.out.println("6 - Remover veículos em manutenção");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n===== VEÍCULOS =====");

                    System.out.println("\n===== CARRO =====");
                    carro.exibirDetalhes();
                    System.out.println("\n===== MOTO =====");
                    moto.exibirDetalhes();
                    System.out.println("\n===== VAN =====");
                    van.exibirDetalhes();
                    break;

                case 2:
                    System.out.println("\n===== ALUGUÉIS =====");

                    for (Aluguel a : alugueis) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    System.out.println("\n===== VEÍCULOS DISPONÍVEIS =====");

                    for (Veiculo v : veiculos) {

                        if (v.getStatus() == StatusVeiculo.DISPONIVEL) {
                            System.out.println(v);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n===== AVALIAÇÕES =====");

                    for (Veiculo v : veiculos) {

                        if (v instanceof Avaliavel) {
                            ((Avaliavel) v).avaliar(10);
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n===== INSPEÇÕES =====");

                    for (Veiculo v : veiculos) {

                        if (v instanceof Inspecionavel) {
                            ((Inspecionavel) v).realizarInspecao();
                        }
                    }
                    break;

                case 6:
                    Iterator<Veiculo> iterator = veiculos.iterator();

                    while (iterator.hasNext()) {

                        Veiculo v = iterator.next();

                        if (v.getStatus() == StatusVeiculo.MANUTENCAO) {
                            iterator.remove();
                        }
                    }

                    System.out.println("Veículos em manutenção removidos.");
                    
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
    
