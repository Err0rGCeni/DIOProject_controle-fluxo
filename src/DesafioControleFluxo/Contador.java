package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        // Scanner terminal = new Scanner(System.in)
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.close();
		
		try {
			// Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
			// Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro!");
		}
		
	}

	/**
	 * @param parametroUm   Número inferior.
	 * @param parametroDois Número superior.
	 * @throws ParametrosInvalidosException Exceção caso parametroUm seja maior do que parametroDois.
	 */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		// Validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		// Realizar o for para imprimir os números com base na variável contagem
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Imprimindo o número " + x);
        };
	}

}