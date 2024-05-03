package br.com.bruno.desafio;

import br.com.bruno.desafio.exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numerosUsuario = capturaNumerosDoUsuario(input);

        try {
            contar(numerosUsuario[0], numerosUsuario[1]);

        } catch (ParametrosInvalidosException e) {
            System.out.printf("%s%n", e.getMessage());
        }

    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero > segundoNumero) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        int qtdIteracoes = segundoNumero - primeiroNumero;
        for (int i = 1; i <= qtdIteracoes; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }

    static int[] capturaNumerosDoUsuario(Scanner scanner){
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();
        return new int[]{primeiroParametro, segundoParametro};
    }

}
