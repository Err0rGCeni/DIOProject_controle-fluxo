package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        // analisarCandidato(1900.0);
        // analisarCandidato(2000.0);
        // analisarCandidato(2200.0);
        // selecaoCandidatos();
        // imprimirSelecionados();
        String[] candidadots = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

        for (String candidato : candidadots) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Contato realizado com " + candidato + " na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguiu contato com o " + candidato);
        }

    }

    // Método Auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo a lista de candidatos:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato Nº " + (indice + 1) + " é " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela",
                "Daniela", "Jorge" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println(candidato + " selecionado.");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }

    }

}
